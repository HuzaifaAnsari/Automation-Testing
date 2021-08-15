import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
        "D://Essential Selenium//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbutton= driver.findElement(By.id("alert-button"));
        alertbutton.click();

        Alert alert = driver.switchTo().alert();
        
        alert.accept();

        driver.quit();
    }
}
