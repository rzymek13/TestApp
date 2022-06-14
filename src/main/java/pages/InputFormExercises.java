package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class InputFormExercises extends BaseTest {
    private WebDriver driver;


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
    public void pierwszeZadanie(String inputMsg) {

        userInputMsg.sendKeys(inputMsg);
        showMsgBtn.click();
        assertEquals(resultBox.getText(), inputMsg);

        }


    @Test
    public void drugieZadanie(String firstNum, String secondNum) {

        sum1.sendKeys(firstNum);
        sum2.sendKeys(secondNum);
        getSumBtn.click();
        assertEquals(resultBox2.getText(), "13");

    }

}
