package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PaymentPage {
    private final WebDriverWait wait;

    private final By paymentBlockTitle = By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]");
    private final By paymentLogos = By.cssSelector(".payment-systems img");
    private final By detailsLink = By.linkText("Подробнее о сервисе");
    private final By phoneInput = By.id("connection-phone");
    private final By amountInput = By.id("connection-sum");
    private final By emailInput = By.id("connection-email");
    private final By continueButton = By.xpath("//button[contains(text(), 'Продолжить')]");
    private final By servicesTab = By.xpath("//a[contains(text(), 'Услуги связи')]");

    public PaymentPage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPaymentBlockTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentBlockTitle)).getText();
    }

    public List<WebElement> getPaymentLogos() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(paymentLogos));
    }

    public void clickDetailsLink() {
        wait.until(ExpectedConditions.elementToBeClickable(detailsLink)).click();
    }

    public void selectServicesTab() {
        wait.until(ExpectedConditions.elementToBeClickable(servicesTab)).click();
    }

    public void enterPhoneNumber(String phone) {
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput));
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void enterAmount(String amount) {
        WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(amountInput));
        amountField.clear();
        amountField.sendKeys(amount);
    }

    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public boolean isErrorDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector(".error-message"))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}