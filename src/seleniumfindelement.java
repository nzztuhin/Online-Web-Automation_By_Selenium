import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfindelement {

        public static void main(String[] args) {

            System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
            WebDriver driver = new ChromeDriver();


            //driver.close();
            driver.manage().window().maximize();
            driver.get("https://reactjs.org/");
            driver.findElement(By.id("algolia-doc-search")).sendKeys("api");


        }
}
