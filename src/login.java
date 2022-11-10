import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");



       driver.findElement(By.name("username")).sendKeys("student");
       driver.findElement(By.name("password")).sendKeys("Password123");
       driver.findElement(By.id("submit")).click();

        String crUrl = driver.getCurrentUrl();
        System.out.println(crUrl);
        String crTitle = driver.getTitle();
        System.out.println(crTitle);

        String ps = driver.getPageSource();
        System.out.println(ps);

    }
}
