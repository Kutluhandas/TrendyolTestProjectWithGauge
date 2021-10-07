import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;


public class SearchPageStepImpl extends BaseTest{

    BasePage basePage;

    @Step("Write the text <text> in the element with the css <css> to search")
    public void sendKeysWithCss(String text, String css) {
        basePage = new BasePage(driver);
        basePage.typeSearch(By.cssSelector(css),text);
    }

    @Step("Click search button element with this css <css>")
    public void click(String css) {
        basePage.clicks(By.cssSelector(css));
    }

    @Step("Check the text <text> in the element with this xpath <xpath> to search page")
    public void getText(String text, String xpath){

        Assert.assertEquals("You are not on Samsung search page",
                text, basePage.saveWithText(By.xpath(xpath)));
    }

    @Step("Wait for <second> seconds to search")
    public void waitImplementation(int second) throws InterruptedException {
        Thread.sleep(second* 1000L);
    }

}
