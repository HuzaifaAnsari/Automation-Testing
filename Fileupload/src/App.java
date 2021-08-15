import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
        "D://Essential Selenium//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        fileupload.sendKeys("Huzaifa-Avatar.png");

        Thread.sleep(10000);

        driver.quit();
    }
}
