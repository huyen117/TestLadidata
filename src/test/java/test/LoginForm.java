package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver webDriver =new ChromeDriver(options);

        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();


        WebElement emailElement = webDriver.findElement(By.cssSelector("#email"));
        emailElement.sendKeys("dangthuhuyen117@gmail.com");
        WebElement passElement = webDriver.findElement(By.cssSelector("#pass"));
        passElement.sendKeys("huyen11795.vl");
        WebElement loginButton = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        loginButton.click();
        //click mess
        WebElement messElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/span/span/div/div[1]"));
        messElement.click();
        Thread.sleep(2000);
        // search name
        WebElement searchElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/label/input"));
        searchElement.sendKeys("Hai Mabu");
        Thread.sleep(3000);
        // choose the first item
        WebElement chooseFirstElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/ul/li/div/a/div"));
        chooseFirstElement.click();
        Thread.sleep(2000);
        for(int i = 0; i<3; i++) {
//        write mess
            WebElement writeMessElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[1]"));
            writeMessElement.sendKeys("Hello Hai Very Handsome");
            Thread.sleep(2000);

//      send
            WebElement sendElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/span[2]/div"));
            sendElement.click();
        }


        Thread.sleep(12000000);
        webDriver.close();
        webDriver.quit();
    }
}
