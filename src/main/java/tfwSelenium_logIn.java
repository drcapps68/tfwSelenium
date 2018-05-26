import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tfwSelenium_logIn {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open Mozilla Firefox
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Dan\\Downloads\\geckodriver-v0.19.1-win64.exe");
//        WebDriver driver = new FirefoxDriver();

        //Navigate to website
        driver.get("http://thefittestwarrior.greenriverdev.com/");

        //Activate login window
        driver.findElement(By.name("logInWindowButton")).click();

        //Enter Log in fields
        driver.findElement(By.name("email")).sendKeys("droid@mail.com");
        driver.findElement(By.name("password")).sendKeys("notstark");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.name("logInButton")).click();

        driver.findElement(By.name("accountTab")).click();

        driver.wait(4000);

        driver.close();
    }
}
