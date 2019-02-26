package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class TravelPage extends PageObject{

    List<WebElement>ob = driver.findElements(By.xpath("//div[@class='FlightListItem__item FlightListItem__item_selected']//div[@class='FlightListItem__header FlightListItem__fadeIn_2hQRR']"));

    public TravelPage(WebDriver driver) {
        super(driver);
    }

    public void printTr() {
        for (WebElement obj : ob) {
            String stringText = obj.getText();
            System.out.println(stringText);
        }
    }
}
