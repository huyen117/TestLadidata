package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestFacebookFb {
    public static void main(String[] args) throws InterruptedException {
        // START CHROME
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver =new ChromeDriver(options);
        webDriver.get("https://www.facebook.com");
        webDriver.manage().window().maximize();

        // Enter username and password
        WebElement emailElement = webDriver.findElement(By.cssSelector("#email"));
        emailElement.sendKeys("dangthuhuyen117@gmail.com");
        WebElement passElement = webDriver.findElement(By.cssSelector("#pass"));
        passElement.sendKeys("huyen11795.vl");
        WebElement loginButton = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        loginButton.click();
        //click mess
        WebElement messElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/div[2]/span/span/div/div[1]"));
        messElement.click();
        Thread.sleep(2000);
        // search name
        WebElement searchElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/label/input"));
        searchElement.sendKeys("Hai Mabu");
        Thread.sleep(3000);
        // choose the first item
        WebElement chooseFirstElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/ul/div[2]/li/div/a/div"));
        chooseFirstElement.click();
        Thread.sleep(2000);
        for(int i = 0; i<3; i++) {
//        write mess
            WebElement writeMessElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div[1]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[1]"));
            writeMessElement.sendKeys("Stop relationship");
            Thread.sleep(2000);

//      send
            WebElement sendElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div[1]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/span[2]/div"));
            sendElement.click();
        }


        webDriver.close();
        webDriver.quit();
    }

    public static WebDriver getWebDriver(String url) {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver webDriver =new ChromeDriver(options);

        webDriver.get(url);
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
