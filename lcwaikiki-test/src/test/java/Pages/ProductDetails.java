package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProductDetails extends BasePage {
    public ProductDetails(WebDriver driver) {
        super(driver);
    }


    public void productDetailsMethod() throws InterruptedException {


        WebElement dataStock = driver.findElement(new By.ByCssSelector("a[key='1']"));
        WebElement dataStock2 = driver.findElement(new By.ByCssSelector("a[key='2']"));
        WebElement dataStock3 = driver.findElement(new By.ByCssSelector("a[key='3']"));
        WebElement dataStock4 = driver.findElement(new By.ByCssSelector("a[key='4']"));


        if (dataStock.isEnabled()) {click(new By.ByCssSelector("a[key='1']"));}
        else if (dataStock2.isEnabled()) {click(new By.ByCssSelector("a[key='2']"));}
        else if (dataStock3.isEnabled()) {click(new By.ByCssSelector("a[key='3']"));}
        else if (dataStock4.isEnabled()) {click(new By.ByCssSelector("a[key='4']"));}
        else {click(By.id("pd_add_to_cart"));}

        click(By.id("pd_add_to_cart"));

        String priceInformation = priceControl(By.xpath("//*[@id='rightInfoBar']/div[1]/div/div[2]/div/div/div[1]/span[2]"));
        String priceInformationApp = priceControl(By.xpath("/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[2]"));
        if (!(priceInformation.equals(priceInformationApp))) {
            System.out.println("fiyatlar farklı");
        }
        else {System.out.println("fiyatlar aynı");}

        TimeUnit.SECONDS.sleep(1);
        click(new By.ByCssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/sepetim\"] i"));


    }


}





