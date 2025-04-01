package Lesson_14;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PaymentTest extends BaseTest {
    @Test(priority = 1)
    public void verifyPaymentBlockTitle() {
        PaymentPage paymentPage = new PaymentPage(driver);
        String actualTitle = paymentPage.getPaymentBlockTitle();
        Assert.assertEquals(actualTitle, "Онлайн пополнение без комиссии",
                "Название блока не соответствует ожидаемому");
    }

    @Test(priority = 2)
    public void verifyPaymentLogos() {
        PaymentPage paymentPage = new PaymentPage(driver);
        List<WebElement> logos = paymentPage.getPaymentLogos();
        Assert.assertFalse(logos.isEmpty(), "Логотипы платёжных систем не отображаются");
        System.out.println("Количество найденных логотипов: " + logos.size());
    }

    @Test(priority = 3)
    public void verifyDetailsLink() {
        PaymentPage paymentPage = new PaymentPage(driver);
        String originalWindow = driver.getWindowHandle();
        paymentPage.clickDetailsLink();

        // Переключение на новую вкладку
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("payments"),
                "Ссылка 'Подробнее о сервисе' ведёт не на ожидаемую страницу");
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @Test(priority = 4)
    public void testContinueButtonFunctionality() {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.selectServicesTab();
        paymentPage.enterPhoneNumber("297777777");
        paymentPage.enterAmount("10");
        paymentPage.enterEmail("test@example.com");
        paymentPage.clickContinueButton();

        // Проверяем, что после нажатия кнопки появилась ошибка (так как это тестовый номер)
        Assert.assertTrue(paymentPage.isErrorDisplayed(),
                "Ожидалось сообщение об ошибке после нажатия кнопки 'Продолжить'");
    }
}