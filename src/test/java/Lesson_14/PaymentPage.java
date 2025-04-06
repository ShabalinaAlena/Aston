package Lesson_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
    // Табы
    @FindBy(xpath = "//a[contains(text(), 'Услуги связи')]")
    private WebElement servicesTab;

    @FindBy(xpath = "//a[contains(text(), 'Домашний интернет')]")
    private WebElement internetTab;

    // Поля ввода
    @FindBy(id = "connection-phone")
    private WebElement phoneInput;

    @FindBy(id = "connection-sum")
    private WebElement amountInput;

    @FindBy(id = "connection-email")
    private WebElement emailInput;

    // Кнопки
    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void selectServicesTab() {
        servicesTab.click();
    }

    public void selectInternetTab() {
        internetTab.click();
    }

    public void enterPhoneNumber(String phone) {
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void enterAmount(String amount) {
        amountInput.clear();
        amountInput.sendKeys(amount);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public PaymentModal clickContinueButton() {
        continueButton.click();
        return new PaymentModal(driver);
    }
}