package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralPage extends PageObject {

    @FindBy(xpath = "//div[@class='TravelFlightsSelectorDesktop__panel_3w0fB']")
    private WebElement secondField;


    public GeneralPage(WebDriver driver) {
        super(driver);
    }

    public void changeField() {
        secondField.click();
    }
}
