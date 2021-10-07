import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;


public class MyFavoritesPageStepImpl extends BaseTest {

    BasePage basePage;

    @Step("Take infos the third product in search page")
    public String saveInListForRequestOne() {
        basePage = new BasePage(driver);
        return basePage.saveInList(By.cssSelector("span[class='prdct-desc-cntnr-name hasRatings']"), 2);
    }

    @Step("Take infos the product that in 'My Favorites' page")
    public String saveForRequestOne() {
        return basePage.saveWithAttribute(By.cssSelector("span[class='prdct-desc-cntnr-name no-white-space']"));
    }

    @Step("Check are products same")
    public void checkSameProduct() {
        Assert.assertEquals("Products are not same",
                "Galaxy M12 64GB Mavi Cep Telefonu (Samsung Türkiye Garantili)",
                saveForRequestOne());
    }

    @Step("Click element with this css <css> to remove button")
    public void click(String css) {
        basePage.clicks(By.cssSelector(css));
    }

    @Step("Check the text <text> in the element with the css <css> to favorites operations")
    public void checkEmptyIsMyFavoritesPage(String text, String css){
        Assert.assertEquals("The 'My Favorites' page is still not empty",
                text,
                basePage.find(By.cssSelector(css)).getText());
    }

    @Step("Wait for <second> seconds to taking infos")
    public void waitImplementation(int second) throws InterruptedException {
        Thread.sleep(second* 1000L);
    }
}
