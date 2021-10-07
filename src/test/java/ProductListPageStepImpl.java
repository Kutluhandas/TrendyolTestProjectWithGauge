import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


public class ProductListPageStepImpl extends BaseTest{

    BasePage basePage;

    @Step("Click the i <i> button among the elements with css <css>")
    public void clickInListForRequestOne(int i, String css) {
        basePage = new BasePage(driver);
        basePage.clickInList(By.cssSelector(css),i);
    }

    @Step("Click element with this css <css> to go to 'My Favorites' pages")
    public void clickToFavs(String css) {
        basePage.clicks(By.cssSelector(css));
    }

}
