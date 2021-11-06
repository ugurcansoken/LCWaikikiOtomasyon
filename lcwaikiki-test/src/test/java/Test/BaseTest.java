package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
public WebDriver driver;


@BeforeAll

    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    driver.manage().window().maximize();


}



}
