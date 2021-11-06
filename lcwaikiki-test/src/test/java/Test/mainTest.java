package Test;

import Pages.BasketPage;
import Pages.HomePage;
import Pages.ProductDetails;
import Pages.ProductsPage;
import org.junit.jupiter.api.Test;

public class mainTest extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetails productDetails;
    BasketPage basketPage;

    @Test
    public void mainTest() throws InterruptedException {

       homePage = new HomePage(driver);
        homePage.homePageMethod();
        productsPage = new ProductsPage(driver);
        productsPage.productsPageMethod();
        productDetails = new ProductDetails(driver);
        productDetails.productDetailsMethod();
        basketPage = new BasketPage(driver);
        basketPage.BasketPageMethod();

    }


}
