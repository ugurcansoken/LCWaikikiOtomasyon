package Pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void BasketPageMethod() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
        click(new By.ByCssSelector("a[class='oq-up plus']"));
        TimeUnit.SECONDS.sleep(1);
        String productNumber = priceControl(By.xpath("//div[@class='col-md-12 cart-header mb-20']//*"));

        if (!(productNumber.equals("Sepetim (1 Ürün)"))) {
            System.out.println("Sepette bir ürün daha eklendi  ");
        } else {
            System.out.println("Sepette bir ürün var ");
        }

        click(new By.ByCssSelector("a[class='cart-square-link']"));
        TimeUnit.SECONDS.sleep(1);


        click(new By.ByCssSelector("a[class='inverted-modal-button sc-delete ins-init-condition-tracking']"));

        TimeUnit.SECONDS.sleep(2);
       assertControl("Sepetinizde ürün bulunmamaktadır.", By.cssSelector("p[class='cart-empty-title']"));
        logger.info("Sepetiniz Boş");

        logger.info("Test Bitti");
    }


}
