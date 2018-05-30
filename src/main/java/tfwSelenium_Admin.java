import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

 /* Dan Capps
 * 5.30.18
 * tfwSelenium_Admin.java
 * This program runs on a Selenium WebDriver test as an Administrator.
 */

public class tfwSelenium_Admin {
    public static void main(String[] args) {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate to website
        driver.get("http://thefittestwarrior.greenriverdev.com/");

        //Activate login window
        driver.findElement(By.name("logInWindowButton")).click();

        //Enter Log in fields
        driver.findElement(By.name("email")).sendKeys("webmaster@thefittestwarrior.com");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.name("logInButton")).click();

        driver.findElement(By.name("accountTab")).click();
    }

}
