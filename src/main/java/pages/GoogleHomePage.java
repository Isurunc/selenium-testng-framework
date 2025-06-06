package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    private WebDriver driver;

    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isSearchBoxVisible() {
        return driver.findElement(searchBox).isDisplayed();
    }
}
