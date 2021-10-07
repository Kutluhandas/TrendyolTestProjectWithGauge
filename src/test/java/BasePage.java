import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public String currentUrl(){return driver.getCurrentUrl();}

    public List<WebElement> selectRequestOne(By locator){return driver.findElements(locator);}

    public void clicks(By locator){
        find(locator).click();
    }

    public void clickInList(By locator, int i){
        selectRequestOne(locator).get(i).click();
    }

    public String saveInList(By locator, int i){
        return selectRequestOne(locator).get(i).getAttribute("title");
    }

    public String saveWithAttribute(By locator){
        return find(locator).getAttribute("title");
    }

    public String saveWithText(By locator){
        return find(locator).getText();
    }

    public void typeSearch(By locator , String text){
        find(locator).sendKeys(text);
    }

}
