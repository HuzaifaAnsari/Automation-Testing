import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
        "D://Essential Selenium//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address=driver.findElement(By.id("autocomplete"));
        address.sendKeys("Gulistan e Johar Block 9 Gul Housing Society Block 9 A Gulshan-e-Iqbal, Karachi,");
        
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        WebElement automcompleteResult = driver.findElement(By.className("pac-item"));
        automcompleteResult.click();
        
        driver.quit();
    }
}
