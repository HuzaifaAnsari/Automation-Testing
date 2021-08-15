import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
        "Users/User4/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com")
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(...charSequences:"Cheese!");
        element.submit();
        driver.quit();
    }
}
