import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
        "D://Essential Selenium//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement button= driver.findElement(By.id("new-tab-button"));
        button.click();

        String originalHandle = driver.getWindowHandle();
        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
