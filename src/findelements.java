import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findelements {
     public static void main(String[] args) {
         System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
         WebDriver driver = new ChromeDriver();


         //driver.close();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");

         List< WebElement> link = driver.findElements(By.tagName("a"));
         System.out.println(link.size());

         for( WebElement l : link) {
             System.out.println(l.getText());
         }
    }
}
