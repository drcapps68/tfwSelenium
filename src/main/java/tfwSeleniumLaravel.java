import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

 /* Dan Capps
 * 5.26.18
 * tfwSeleniumLaravel.java
 * This program runs on a Selenium WebDriver test through Laravel via homestead.test
 */


public class tfwSeleniumLaravel {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open Mozilla Firefox
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Dan\\Downloads\\geckodriver-v0.19.1-win64.exe");
//        WebDriver driver = new FirefoxDriver();

        JavascriptExecutor scroller = (JavascriptExecutor) driver;

        //Navigate to website
        driver.get("http://homestead.test/");


        //Enter Sign up fields
        driver.findElement(By.name("first_name")).sendKeys("Robbie");
        driver.findElement(By.name("last_name")).sendKeys("D'Robot");
        driver.findElement(By.name("email")).sendKeys("droid@mail.com");
        driver.findElement(By.name("password")).sendKeys("notstark");
        driver.findElement(By.name("password_confirmation")).sendKeys("notstark");
        driver.findElement(By.name("submitButton")).click();

        scroller.executeScript("window.scrollBy(0, -250)", "");

        Thread.sleep(5000);

        //Enter Log in fields
        //Activate login window
        driver.findElement(By.name("logInWindowButton")).click();

        //Enter Log in fields
        driver.findElement(By.name("email")).sendKeys("droid@mail.com");
        driver.findElement(By.name("password")).sendKeys("notstark");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.name("logInButton")).click();

        Thread.sleep(5000);

        //Edit account
        driver.findElement(By.name("accountTab")).click();
        driver.findElement(By.name("editAccountInfoButton")).click();
        driver.findElement(By.name("age")).clear();
        driver.findElement(By.name("age")).sendKeys("21");
        driver.findElement(By.name("submitButton")).click();

        Thread.sleep(5000);

        //Go to About page
        driver.findElement(By.name("aboutTab")).click();

        Thread.sleep(5000);

        //Go to Contact page
        driver.findElement(By.name("contactTab")).click();

        Thread.sleep(5000);

        //Close window
        driver.close();
    }
}
