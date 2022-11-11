import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","F://selenium//Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        //Absolute xpath

        //driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("shirt");
        //driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

        // Relative xpath

//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts of man");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        //or operator
        //driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("shirts of women");
        //and operator
       // driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).sendKeys("shirts of women");
       // driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        //driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("pants for man");

//        driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("pants for kids");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        driver.findElement(By.xpath("//a[text()=' Sell']")).click();

    }
}
