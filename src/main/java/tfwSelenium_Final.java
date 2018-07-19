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

public class tfwSelenium_Final {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate to website
        driver.get("http://thefittestwarrior.greenriverdev.com/");

        //Enter Sign up fields
        //This will show an error because the name is already taken
        driver.findElement(By.name("first_name")).sendKeys("Steve");
        Thread.sleep(2000);
        driver.findElement(By.name("last_name")).sendKeys("Rogers");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("cap@avengers.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.name("password_confirmation")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.name("submitButton")).click();
        Thread.sleep(4000);

        //Enter Log in fields
        //Activate login window
        driver.findElement(By.name("logInWindowButton")).click();
        Thread.sleep(3000);

        //Enter Log in fields
        driver.findElement(By.name("email")).sendKeys("cap@avengers.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.name("remember")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("logInButton")).click();
        Thread.sleep(5000);

        //Go to Main Page
        driver.findElement(By.className("navbar-brand")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("accountTab")).click();




    }
}
