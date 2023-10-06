package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSignInGoogle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = TestFacebookFb.getWebDriver("https://www.gmail.com");

        webDriver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement createAccount = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement create = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]"));
        create.click();
        Thread.sleep(2000);
        WebElement firstName = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input"));
        firstName.sendKeys("Mai");
        Thread.sleep(2000);
        WebElement name = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/input"));
        name.sendKeys("Ltt11");
        Thread.sleep(2000);
        WebElement nameEmail = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input"));
        nameEmail.sendKeys("mailtt11071999");
        Thread.sleep(2000);
        WebElement password = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input"));
        password.sendKeys("huyen11799.vl");
        Thread.sleep(2000);
        WebElement confirmPassword = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        confirmPassword.sendKeys("huyen11799.vl");
        Thread.sleep(2000);
        WebElement checkbox = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input"));
        checkbox.click();
        Thread.sleep(2000);
        WebElement clickSignIn = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
        clickSignIn.click();
        Thread.sleep(2000);
        WebElement importPhone = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div[2]/div[1]/label/input"));
        importPhone.sendKeys("0329680253");
        Thread.sleep(1000);
        WebElement signInPhone = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
        signInPhone.click();

webDriver.close();
webDriver.quit();



    }
}
