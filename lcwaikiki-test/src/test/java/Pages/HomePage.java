package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void homePageMethod() throws InterruptedException {
        logger.info("TEST BAŞLADI");


        assertUrl("https://www.lcwaikiki.com/tr-TR/TR");
        click(By.cssSelector("p[class='cookie__button'] button"));
        hover(new By.ByCssSelector("div[class='dropdown cart-dropdown'] a[href='https://www.lcwaikiki.com/tr-TR/TR/giris'] svg"));
        click(new By.ByCssSelector("div[class='dropdown cart-dropdown'] a[href='https://www.lcwaikiki.com/tr-TR/TR/giris'] svg"));
        TimeUnit.SECONDS.sleep(1);

        click(By.id("LoginEmail"));
        sendKeys(By.id("LoginEmail"), "ugurcansoken@gmail.com");
        click(By.id("Password"));
        sendKeys(By.id("Password"), "ugurcansoken123");
        click(By.id("loginLink"));

        WebElement accessControl = driver.findElement(By.xpath("//*[@id='header__container']/div/header/div[2]/div/div[3]/div[2]/div[1]/button/span"));
        Assertions.assertEquals("Hesabım", accessControl.getText());
        logger.info("Giriş yapıldı");

        click(By.id("search_input"));
        sendKeys(By.id("search_input"), "Pantolan");
        click(new By.ByCssSelector("button[type='button']"));
        logger.info("pantolon kelimesi aratıldı");
    }


}
