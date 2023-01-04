package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestSignIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver webDriver =new ChromeDriver(options);

        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        WebElement loginButton = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        loginButton.click();
        Thread.sleep(2000);
//        create account
        WebElement firstNameElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
        firstNameElement.sendKeys("Hai ");
        Thread.sleep(1000);

        WebElement surNameElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
        surNameElement.sendKeys("Mai");
        Thread.sleep(1000);
        WebElement emailAddressElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        emailAddressElement.sendKeys("marocvi89@gmail.com");
        Thread.sleep(1000);
        WebElement reEmailAddressElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
        reEmailAddressElement.sendKeys("marocvi89@gmail.com");
        Thread.sleep(1000);
        WebElement newPasswordElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
        newPasswordElement.sendKeys("huyen11799.vll");
        Thread.sleep(1000);
//        select date birth
        Select selectDateByValue = new Select(webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")));
        selectDateByValue.selectByValue("3");
        Thread.sleep(1000);

        Select selectMonthByValue = new Select(webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")));
        selectMonthByValue.selectByValue("2");
        Thread.sleep(1000);

        Select selectYearByValue = new Select(webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")));
        selectYearByValue.selectByValue("1995");
        Thread.sleep(1000);
//        click sex
        WebElement selecte = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
        Thread.sleep(1000);
        if (!selecte.isSelected()) {
            selecte.click();
        }
        Thread.sleep(1000);

//        click login
        WebElement logInElement = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
        logInElement.click();








    }
}
