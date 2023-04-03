import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver(); //recupération des Chromedriver
        driver.manage().window().maximize(); // Afin d'ouvrir la page a la taille maximum proposée par le navigateur// AfterMethod
    }

    @Test
    public void testAmazon2() {

        //String expectedTitle = "";
        driver.get("https://www.amazon.fr");


    }

    @AfterMethod
    public void teardown() {

        driver.quit(); // fermeture du navigateur chrome
    }
}