package ru.Tinkoff.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    public static WebDriver driver;
    private static String cfgBeg;
    private static String cfgEnd;


    @BeforeClass
    public static void setUp() {

        cfgBeg = "webdriver.chrome.driver";//override this for your environment
        cfgEnd = "/home/vollspy/Documents/chromedriver";//override this for your environment

        System.setProperty(cfgBeg, cfgEnd);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.get("https://www.tinkoff.ru/travel/flights/multi-way/MOW-LED/02-26/LED-MOW/02-28/?adults=1&children=0&infants=0&cabin=Y&composite=0");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@After
    //public void cleanUp() {
    //    driver.manage().deleteAllCookies();
    //}
//
    //@AfterClass
    //public static void tearDown() {
    //    driver.close();
    //}

}
