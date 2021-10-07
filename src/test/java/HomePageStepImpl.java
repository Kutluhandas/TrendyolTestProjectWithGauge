import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePageStepImpl extends BaseTest {

    BasePage basePage;

    @Step("Check is open Trenyol with this url <url>")
    public void assertTrueToHomePage(String url) {
        basePage = new BasePage(driver);
        Assert.assertEquals( "You are not on Trendyol web-page",
                basePage.currentUrl(), url);
    }

    @Step("Click close button to close ads element with this css <css> at home page")
    public void clickCloseButton(String css) {
        basePage.clicks(By.cssSelector(css));
    }

    @Step("Click log in button to open log in page element with this css <css> at home page")
    public void clickLogInButton(String css) {
        basePage.clicks(By.cssSelector(css));
    }

    @Step("Accept cookies")
    public void acceptCookies(){
        basePage.clicks(By.cssSelector("a[class='cookie-policy-accept-button']"));
    }

}
