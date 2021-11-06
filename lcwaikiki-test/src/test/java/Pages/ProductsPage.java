package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void productsPageMethod() throws InterruptedException {
        scrollDown();
        click(new By.ByCssSelector("a[href='https://www.lcwaikiki.com/tr-TR/TR/arama?q=Pantolan&PageIndex=2']"));
        TimeUnit.SECONDS.sleep(1);

        randomSelect(new By.ByCssSelector("div[class='col-xs-6 col-sm-6 col-md-3 four-column c-item product-item-wrapper']"));
        logger.info("random ürün seçildi");

    }


}
