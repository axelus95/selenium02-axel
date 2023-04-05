package AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    By searchFristResultat = By.cssSelector("div._bXVsd_tint_M0L-m");
    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchFristResultat() {
        driver.findElement(searchFristResultat).click();

    }
}
