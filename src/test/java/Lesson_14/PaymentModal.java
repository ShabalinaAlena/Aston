package Lesson_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PaymentModal extends BasePage {
    @FindBy(css = ".modal-content .amount")
    private WebElement amountDisplay;

    @FindBy(css = ".modal-content .phone-number")
    private WebElement phoneDisplay;

    @FindBy(css = ".payment-systems img")
    private List<WebElement> paymentSystemIcons;

    @FindBy(css = ".modal-content .submit-btn")
    private WebElement submitButton;

    public PaymentModal(WebDriver driver) {
        super(driver);
    }

    public String getDisplayedAmount() {
        return amountDisplay.getText();
    }

    public String getDisplayedPhone() {
        return phoneDisplay.getText();
    }

    public int getPaymentSystemIconsCount() {
        return paymentSystemIcons.size();
    }

    public String getSubmitButtonText() {
        return submitButton.getText();
    }
}