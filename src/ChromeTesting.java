import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTesting {
    public static void main(String[] args) {
        String baseurl="https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        // Lunch the Url
        driver.get(baseurl);
        // Maximise window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current Url
        String url=driver.getCurrentUrl();
        System.out.println("Current Url "+ url);
        // Print the page source
        String pageSource=driver.getPageSource();
        System.out.println("Page source "+ pageSource);
        // find email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        // Sending email to email field element
        emailField.sendKeys("miiiittttesh.ppppatel@yahooo.com");
        // Find password field element
        WebElement passwordfield= driver.findElement(By.name("password"));
        // Sending password to password field element
        passwordfield.sendKeys("444444");
        // Close browser
        driver.close();
    }
}
