package Lesson_14;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("Платежная система MTS")
@Feature("Онлайн пополнение без комиссии")
public class PaymentTest extends BaseTest {
    private PaymentPage paymentPage;
    private final TestData testData = new TestData();

    @BeforeMethod
    @Step("Открытие страницы платежей")
    public void openPaymentPage() {
        Allure.addAttachment("URL", "text/plain", BASE_URL + "/payments");
        paymentPage = new PaymentPage(driver);
        driver.get(BASE_URL + "/payments");
    }

    @Test(description = "Проверка платежа за мобильную связь")
    @Story("Пользователь совершает платеж за услуги связи")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Тест проверяет корректность отображения данных в модальном окне после заполнения формы")
    public void verifyPaymentForMobileServices() {
        Allure.step("Заполнение формы платежа", () -> {
            paymentPage.selectServicesTab();
            paymentPage.enterPhoneNumber(testData.PHONE);
            paymentPage.enterAmount(testData.AMOUNT);
            paymentPage.enterEmail(testData.EMAIL);

            Allure.addAttachment("Введенные данные",
                    "phone: " + testData.PHONE + "\n" +
                            "amount: " + testData.AMOUNT + "\n" +
                            "email: " + testData.EMAIL);
        });

        PaymentModal modal = paymentPage.clickContinueButton();

        Allure.step("Проверка данных в модальном окне", () -> {
            Assert.assertTrue(modal.getDisplayedAmount().contains(testData.AMOUNT),
                    "Сумма платежа не совпадает");
            Assert.assertEquals(modal.getDisplayedPhone(), testData.PHONE,
                    "Номер телефона не совпадает");
            Assert.assertTrue(modal.getPaymentSystemIconsCount() > 0,
                    "Отсутствуют иконки платежных систем");
            Assert.assertTrue(modal.getSubmitButtonText().contains(testData.AMOUNT),
                    "Сумма на кнопке не совпадает");
        });
    }

    @Test(description = "Проверка различных вариантов оплаты")
    @Story("Пользователь просматривает варианты оплаты")
    @Severity(SeverityLevel.NORMAL)
    public void verifyDifferentPaymentOptions() {
        Allure.step("Проверка вкладки 'Услуги связи'", () -> {
            paymentPage.selectServicesTab();
            Assert.assertTrue(driver.getPageSource().contains("Услуги связи"),
                    "Вкладка 'Услуги связи' не найдена");
        });

        Allure.step("Проверка вкладки 'Домашний интернет'", () -> {
            paymentPage.selectInternetTab();
            Assert.assertTrue(driver.getPageSource().contains("Домашний интернет"),
                    "Вкладка 'Домашний интернет' не найдена");
        });
    }
}

class TestData {
    final String PHONE = "297777777";
    final String AMOUNT = "10";
    final String EMAIL = "test@example.com";
}