package Lesson_14;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    private PaymentPage paymentPage;

    @BeforeMethod
    public void openPaymentPage() {
        paymentPage = new PaymentPage(driver);
        driver.get(BASE_URL + "/payments");
    }

    @Test
    public void verifyPaymentForMobileServices() {
        paymentPage.selectServicesTab();
        paymentPage.enterPhoneNumber("297777777");
        paymentPage.enterAmount("10");
        paymentPage.enterEmail("test@example.com");

        PaymentModal modal = paymentPage.clickContinueButton();

        Assert.assertTrue(modal.getDisplayedAmount().contains("10"));
        Assert.assertEquals(modal.getDisplayedPhone(), "297777777");
        Assert.assertTrue(modal.getPaymentSystemIconsCount() > 0);
        Assert.assertTrue(modal.getSubmitButtonText().contains("10"));
    }

    @Test
    public void verifyDifferentPaymentOptions() {
        paymentPage.selectServicesTab();
        Assert.assertTrue(driver.getPageSource().contains("Услуги связи"));

        paymentPage.selectInternetTab();
        Assert.assertTrue(driver.getPageSource().contains("Домашний интернет"));
    }
}