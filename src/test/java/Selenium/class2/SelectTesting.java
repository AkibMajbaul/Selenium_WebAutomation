package Selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select Country=new Select(driver.findElement(By.name("country")));
        Country.selectByIndex(5);
        Thread.sleep(2000);
        Country.selectByVisibleText("10");
        Thread.sleep(2000);
        Country.selectByValue("BANGLADESH");
        Thread.sleep(1000);


        List<WebElement> elements= Country.getOptions();
        for (WebElement element : elements) {
            System.out.println(element.getText().trim());
        }

driver.quit();
    }
}
