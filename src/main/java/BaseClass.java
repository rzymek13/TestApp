import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class BaseClass {

    public static WebDriver driver;
    public static String pierwszyInput = "no witam";

    @BeforeMethod
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public static void firstExerc() throws InterruptedException {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.id("user-message")).sendKeys(pierwszyInput);
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        assertEquals(driver.findElement(By.id("display")).getText(), pierwszyInput);

    }
    @Test
    public static void secondExerc() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.id("sum1")).sendKeys("5");
        driver.findElement(By.id("sum2")).sendKeys("7");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        assertEquals(driver.findElement(By.id("displayvalue")).getText(), "12");

    }
}
