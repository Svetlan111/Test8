import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","C:\\Webdriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseurl = "https://netpeak.ua/";
        driver.get(baseurl);
        driver.findElement(By.linkText("Карьера")).click();
        for (String winHandl: driver.getWindowHandles()) {
            driver.switchTo().window(winHandl);
        }
        driver.findElement(By.linkText("Я хочу работать в Netpeak")).click();
        driver.findElement(By.id("inputName")).sendKeys("hfsuhfuehf");
        driver.findElement(By.id("inputLastname")).sendKeys("bfhbiuhb");
        driver.findElement(By.name("by")).sendKeys("1990");
        driver.findElement(By.name("bm")).sendKeys("апреля");
        driver.findElement(By.name("bd")).sendKeys("5");
        driver.findElement(By.id("inputEmail")).sendKeys("giudgu@gmail.com");
        driver.findElement(By.id("inputPhone")).sendKeys("+380947464766");
        driver.findElement(By.name("up_file")).sendKeys("C:\\Users\\Администратор\\Desktop\\Lev.jpg");

        driver.findElement(By.name("difficult")).click();

        driver.findElement(By.linkText("Курсы")).click();

    }
}
