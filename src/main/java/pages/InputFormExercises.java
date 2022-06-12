package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InputFormExercises {
    private WebDriver driver;
    private String pierwszyInput = "no witam";

    @FindBy(id ="at-cv-lightbox-close")
    private WebElement closingAdv;

    @FindBy(id ="user-message")
    private WebElement userInputMsg;

    @FindBy(xpath ="//*[@id=\"get-input\"]/button")
    private WebElement showMsgBtn;

    @FindBy(id ="display")
    private WebElement resultBox;

    @FindBy(id ="sum1")
    private WebElement sum1;

    @FindBy(id ="sum2")
    private WebElement sum2;

    @FindBy(xpath ="//*[@id=\"gettotal\"]/button")
    private WebElement getSumBtn;

    @FindBy(id ="displayvalue")
    private WebElement resultBox2;

    public InputFormExercises(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @Test
    public void pierwszeZadanie() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        Thread.sleep(2000);
        closingAdv.click();
        userInputMsg.sendKeys(pierwszyInput);
    }

}
