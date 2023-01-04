package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.coccoc.com/");
        Thread.sleep(30000);



        webDriver.close();
        webDriver.quit();

    }
}
