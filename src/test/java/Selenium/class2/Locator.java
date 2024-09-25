package Selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");

        String text = driver.findElement(By.className("caption")).getText().trim();
        System.out.println(driver.getTitle());

        driver.findElement(By.name("username")).sendKeys("Akib");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("Akib1234");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Akib");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Majbaul");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Dhaka");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1207");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("01644213613");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        Thread.sleep(2000);


        WebElement element=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        System.out.println("Font Size:" + element.getCssValue("font-size"));
        System.out.println("Color:" + element.getCssValue("color") );
        System.out.println("Font Name:" + element.getCssValue("font-family"));




        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement el : elements) {
            System.out.println(el.getAttribute("href"));
        }

        

        driver.quit();
    }
}
