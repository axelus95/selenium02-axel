import AmazonProject.HomePage;
import AmazonProject.ProductPage;
import AmazonProject.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver(); //recupération des Chromedriver
        driver.manage().window().maximize(); // Afin d'ouvrir la page a la taille maximum proposée par le navigateur// AfterMethod
    }

    //@AfterMethod
    //public void teardown() {

      //  driver.quit(); // fermeture du navigateur chrome
    //}


    @Test
    public void testAmazon3() {

        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage= new SearchResultPage(driver);
        ProductPage productPage = new ProductPage(driver);

        String keyword = "iphone 14 pro max";
        String expectedTitle = "iphone 14 pro max";
        driver.get("https://amazon.fr");
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.name("field-keywords")).sendKeys(keyword);
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement SearchResultPage = driver.findElement(By.cssSelector(":not AdHolder [data-uuid=\"c8f2870f-e0f7-41a4-b70c-10e5b0f3b07e\"]"));
        SearchResultPage.click();


    }





}