package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class CheckBoxExercises extends BaseTest {


    @FindBy(id="isAgeSelected")
    private WebElement checkbox;

    @FindBy(id="txtAge")
    private WebElement checkBoxResult;

    public CheckBoxExercises(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void checkBoxFirstExercises() {
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        checkbox.click();

    }
}
