package test;

import org.junit.Test;
import org.openqa.selenium.*;

import static test.TestFacebookFb.getWebDriver;

public class JUnitTest {
    @Test
    public void testSignInAndSendMess() throws InterruptedException {
        TestFacebookFb.main(null);
    }
    @Test
    public void testStartChrome() throws InterruptedException {
        WebDriver webDriver = getWebDriver("https://www.Chrome.com");



        webDriver.close();
        webDriver.quit();

    }
    @Test
    public void testSignUp() throws InterruptedException {
        throw new RuntimeException();
//        TestSignUp.main(null);
    }
    @Test
    public void testSignInGoogle() throws InterruptedException {
        TestSignInGoogle.main(null);

    }

    @Test
    public void testSendAndReciveMessage(){
        // 1.Open Chrome
        // 2. Open facebook huyen hip
        // 3. Send Message to Hai Mabu "Hi Hai"
        // 4. Close Chrome
        // 5. Open Chrome
        // 6. Open Facebook hai mabu
        // 7.Get message from Huyen Hip
        // 8. Assert actualMessage == expect Message
       //    Assert.assertEquals(sendMessage, recivedMessage);
//        1.
//        signUpFb
        WebDriver webDriver = getWebDriver("https://www.facebook.com");
        WebElement emailElement = webDriver.findElement(By.cssSelector("#email"));
        emailElement.sendKeys("dangthuhuyen117@gmail.com");
        WebElement passElement = webDriver.findElement(By.cssSelector("#pass"));
        passElement.sendKeys("huyen11795.vl");
        WebElement loginButton = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        loginButton.click();
//        send message
        WebElement messElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/span/span/div/div[1]"));
        messElement.click();
        WebElement searchElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/label/input"));
        searchElement.sendKeys("Hai Mabu");
        WebElement chooseFirstElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/ul/li/div/a/div"));
        chooseFirstElement.click();
        for(int i = 0; i<1; i++) {
//        write mess
            WebElement writeMessElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[1]"));
            writeMessElement.sendKeys("Hello Hai ");

            WebElement sendElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/span[2]/div"));
            sendElement.click();
        }
        webDriver.close();
        webDriver.quit();

//      6.

        WebDriver webDriver1 = getWebDriver("https://www.facebook.com");
        WebElement phonelElement = webDriver.findElement(By.cssSelector("#phone"));
        emailElement.sendKeys("034o8379749");
        WebElement passwordElement = webDriver.findElement(By.cssSelector("#pass"));
        passwordElement.sendKeys("Abaproo1*");

    }
    @Test
public void test() {
    WebDriver webDriver1 = getWebDriver("https://www.facebook.com");
    WebElement phonelElement = webDriver1.findElement(By.cssSelector("#email"));
    Alert emailElement = null;
    emailElement.sendKeys("03408379749");
    WebElement passwordElement = webDriver1.findElement(By.cssSelector("#passContainer"));
    passwordElement.sendKeys("Abaproo1*");

}

//    public static void main(String[] args) {
//        new JUnitTest().testLoginFb();
//    }
}
