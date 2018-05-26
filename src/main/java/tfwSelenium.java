import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tfwSelenium {
    public static void main(String[] args) throws InterruptedException {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open Mozilla Firefox
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Dan\\Downloads\\geckodriver-v0.19.1-win64.exe");
//        WebDriver driver = new FirefoxDriver();

        //Navigate to website
        driver.get("http://thefittestwarrior.greenriverdev.com/");

        //Enter Sign up fields
        //This will show an error because the name is already taken
        driver.findElement(By.name("first_name")).sendKeys("Robbie");
        driver.findElement(By.name("last_name")).sendKeys("D'Robot");
        driver.findElement(By.name("email")).sendKeys("droid@mail.com");
        driver.findElement(By.name("password")).sendKeys("notstark");
        driver.findElement(By.name("password_confirmation")).sendKeys("notstark");
        driver.findElement(By.name("submitButton")).click();

        Thread.sleep(5000);

        //Enter Log in fields
        //Activate login window
        driver.findElement(By.name("logInWindowButton")).click();

        Thread.sleep(1000);

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

        //Go to Gyms page
        driver.findElement(By.name("gymsTab")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("visitGymButton")).click();

        Thread.sleep(5000);

        //Go to About page
        driver.findElement(By.name("aboutTab")).click();

        Thread.sleep(5000);

        //Go to Contact page
        driver.findElement(By.name("contactTab")).click();

        Thread.sleep(5000);

        driver.close();
    }
}
