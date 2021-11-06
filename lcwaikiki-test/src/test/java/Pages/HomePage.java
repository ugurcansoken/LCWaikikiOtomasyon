package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }


public void homePageMethod(){
    logger.info("TEST BAŞLADI");
    Assertions.assertEquals("https://www.lcwaikiki.com/tr-TR/TR", driver.getCurrentUrl());
    hover(new By.ByCssSelector("div[class='dropdown cart-dropdown'] a[href='https://www.lcwaikiki.com/tr-TR/TR/giris'] svg"));
    click(new By.ByCssSelector("div[class='dropdown cart-dropdown'] a[href='https://www.lcwaikiki.com/tr-TR/TR/giris'] svg"));
    click(By.id("LoginEmail"));
    sendKeys(By.id("LoginEmail"), "ugurcansoken@gmail.com");
    click(By.id("Password"));
    sendKeys(By.id("Password"), "ugurcansoken123");
    click(By.id("loginLink"));

   WebElement accessControl = driver.findElement(By.xpath("//*[@id=\"header__container\"]/div/header/div[2]/div/div[3]/div[2]/div[1]/button/span"));
    Assertions.assertEquals("Hesabım", accessControl.getText());
   click(By.id("search_input"));
    sendKeys(By.id("search_input"), "Pantolan");
    click(new By.ByCssSelector("button[type='button']"));
}





}
