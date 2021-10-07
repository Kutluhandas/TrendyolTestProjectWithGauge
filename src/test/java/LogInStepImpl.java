import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LogInStepImpl extends BaseTest{

    BasePage basePage;

    @Step("Write the text <text> in the element with the id <id> to log in operations")
    public void sendKeysWithCss(String text, String id) {
        basePage = new BasePage(driver);
        basePage.typeSearch(By.id(id),text);
    }

    @Step("Click submit button element with this css <css>")
    public void click(String css) {
        basePage.clicks(By.cssSelector(css));
    }

    @Step("Wait for <second> seconds to managing log in")
    public void waitImplementation(int second) throws InterruptedException {
        Thread.sleep(second* 1000L);
    }

}
