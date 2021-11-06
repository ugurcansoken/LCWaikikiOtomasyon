package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

public void productsPageMethod(){

          scrollDown();
            click(new By.ByCssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/arama?q=Pantolan&PageIndex=2\"]"));
            randomSelect(new By.ByCssSelector("div[class='col-xs-6 col-sm-6 col-md-3 four-column c-item product-item-wrapper']"));



    }



}
