package test;

import org.openqa.selenium.WebDriver;

public class StartChrome {



    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = TestFacebookFb.getWebDriver("https://www.Chrome.com");



        webDriver.close();
        webDriver.quit();

    }
}
