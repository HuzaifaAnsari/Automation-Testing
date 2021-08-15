import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
        "D://Essential Selenium//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        WebElement first_name = driver.findElement(By.id("first-name"));
        first_name.sendKeys("Huzaifa");

        WebElement last_name = driver.findElement(By.id("last-name"));
        last_name.sendKeys("Ansari");

        WebElement job_title = driver.findElement(By.id("job-title"));
        job_title.sendKeys("Software Engineer");

        WebElement education = driver.findElement(By.id("radio-button-1"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement experience = driver.findElement(By.id("select-menu"));
        experience.click();

        WebElement year_experience = driver.findElement(By.xpath("//*[@id='select-menu']/option[2]"));
        year_experience.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("07/1/2020");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        WebElement submit_button = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submit_button.click();

        WebDriverWait wait =new WebDriverWait(driver,10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alert_text =alert.getText();

        assertEquals("The form was successfully submitted!",alert_text);
        driver.quit();
    }
}
