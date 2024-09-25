package Selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);



        driver.navigate().to("https://parabank.parasoft.com/");
        Thread.sleep(1000);


        driver.findElement(By.name("username")).sendKeys("Akib");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Akib1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        Thread.sleep(2000);


        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);




        driver.quit();

    }
}
