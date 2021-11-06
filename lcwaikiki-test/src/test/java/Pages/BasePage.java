package Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 50);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findList(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        find(locator).click();
    }

    public void sendKeys(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,7000)");
    }

    public void assertUrl(String url){
        Assert.assertEquals(url,driver.getCurrentUrl());

    }
    public void assertControl(String text , By locator){

        Assert.assertEquals(text , priceControl(locator));

    }


    public void randomSelect(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));

        Random rand = new Random();
        findList(locator).get(rand.nextInt(findList(locator).size())).click();
    }

    public void hover(By locator) {
        Actions action = new Actions(driver);
        action.moveToElement(find(locator)).build().perform();

    }

    public String priceControl(By locator) {
        return driver.findElement(locator).getText();
    }


}

