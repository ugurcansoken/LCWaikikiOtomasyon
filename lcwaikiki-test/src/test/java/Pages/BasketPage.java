package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasketPage(WebDriver driver) {
        super(driver);
    }

public void BasketPageMethod(){
    click(new By.ByCssSelector("a[class='oq-up plus']"));
    String productNumber = priceControl(By.xpath("//div[@class='col-md-12 cart-header mb-20']//*"));

    if(!(productNumber.equals("Sepetim (1 Ürün)"))){
        System.out.println("Sepette birden fazla ürün var  ");
    }
    else{
        System.out.println("Sepette bir ürün var ");
    }
    click(new By.ByCssSelector("a[class='cart-square-link']"));
    click(new By.ByCssSelector("a[class='inverted-modal-button sc-delete ins-init-condition-tracking']"));
    click(new By.ByCssSelector("i[class='header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims']"));
    String paketNumber = priceControl(By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div/div/p[1]"));
    if(paketNumber.equals("Sepetinizde ürün bulunmamaktadır.")){
        System.out.println("sepetinizde ürün bulunamadı");
    }
    else{
        System.out.println("sepetinizde silinmemiş ürün var");
    }
    logger.info("Test Bitti");
}



}
