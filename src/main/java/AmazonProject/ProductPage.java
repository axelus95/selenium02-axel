package AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    By productProduit = By.cssSelector("div._bXVsd_tint_M0L-m");
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setProductProduit() {
        driver.findElement(productProduit).click();

    }
}
