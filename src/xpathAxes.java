import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpathAxes {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://money.rediff.com/gainers");

        //xpath axes self node
        //driver.findElement(By.xpath("//a[contains(.,'Zomato')]/self::a")).click();
        String selfnode = driver.findElement(By.xpath("//a[contains(.,'Zomato')]/self::a")).getText();
        System.out.println("the self node is "+ selfnode);

        //parent node
        String parentnode =  driver.findElement(By.xpath("//a[contains(.,'Zomato')]/parent::td")).getText();
        System.out.println("the self node is " + parentnode);

        //child node
        List<WebElement> childnode = driver.findElements(By.xpath("//a[contains(.,'Zomato')]/ancestor::tr/child::*"));
        System.out.println("the no of child nodes are: "+ childnode.size());


        //ancester node
        String ancesternode =  driver.findElement(By.xpath("//a[contains(.,'Zomato')]/ancestor::tr")).getText();
        System.out.println("the self node is " + ancesternode );

        //following
        List<WebElement> followingtag = driver.findElements(By.xpath("//a[contains(.,'Zomato')]/following::*"));
        System.out.println("the no of following elements for  tag  are: "+ followingtag.size());

        //following siblings
        List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(.,'Zomato')]/ancestor::tr/following-sibling::*"));
        System.out.println("the no of following elements for  tag  are: "+ followingsiblings.size());

        //preceding
        List<WebElement> precedingnode = driver.findElements(By.xpath("//a[contains(.,'Zomato')]/preceding::*"));
        System.out.println("the no of preceding node  are: "+ precedingnode.size());

        //preceding sibling
        List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(.,'Zomato')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("the no of preceding siblings  are: "+ precedingsiblings.size());

        driver.close();


    }
}
