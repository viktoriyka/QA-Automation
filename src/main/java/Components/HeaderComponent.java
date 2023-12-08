package Components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HeaderComponent {

    private SelenideElement header;
    private SelenideElement mainPageButton;
    private SelenideElement placeButton;
    private SelenideElement dateButton;
    private SelenideElement guestButton;
    private SelenideElement hostButton;
    private SelenideElement languageButton;
    private SelenideElement profileButton;
    private SelenideElement locationInput;
    private SelenideElement loginbutton;
    private SelenideElement guestPopUpButton;
    private SelenideElement plusAdultButton;
    private SelenideElement plusChildrenButton;
    private SelenideElement searchButton;
    private List<SelenideElement> categories;
    private SelenideElement myAccountButton;
    public HeaderComponent() {
        this.header = $x("//header");
        this.mainPageButton = $x("//header/div/div[1]/a");
        this.locationInput = $x("//*[@id=\"bigsearch-query-location-input\"]");
        this.placeButton = $x("//div/span[2]/button[1]");
        this.dateButton = $x("//div/span[2]/button[2]");
        this.guestButton = $x("//div/span[2]/button[3]/div[1]");
        this.hostButton = $x("//div/div[3]/nav/div[1]/a");
        this.languageButton = $x("//div[3]/nav/div[1]/div/button");
        this.profileButton = $x("//div[3]/nav/div[2]/div/button");
        this.guestPopUpButton = $x("//*[@id=\"search-tabpanel\"]/div[1]/div[5]/div[1]/div[1]/div");
        this.loginbutton = $x("//*[@id=\"simple-header-profile-menu\"]/div/a[1]");
        this.plusAdultButton = $x("//*[@id=\"stepper-adults\"]/button[2]");
        this.plusChildrenButton = $x("//*[@id=\"stepper-children\"]/button[2]");
        this.searchButton = $x("//*[@id=\"search-tabpanel\"]/div[1]/div[5]/div[1]/div[3]/button/span[1]/span");
        this.categories = $$x("//*[@id=\"categoryScroller\"]/div/div/div/div[3]/div/div/div/div");
        this.myAccountButton = $x("//*[@id=\"simple-header-profile-menu\"]/div/a[7]");
    }

    @Step("Click language button")
    public HeaderComponent clickLanguageButton(){
        languageButton.click();
        return this;
    }

    @Step("Input location")
    public HeaderComponent inputLocation(String nameOfLocation) {
        placeButton.click();
        locationInput.sendKeys(nameOfLocation);
        return this;
    }

    @Step("Click guest button")
    public HeaderComponent clickGuestPopUpButton() {
        guestPopUpButton.click();
        return this;
    }

    @Step("Click plus adult button")
    public HeaderComponent clickPlusAdultButton(){
        plusAdultButton.click();
        plusAdultButton.click();
        return this;
    }

    @Step("Click plus children button")
    public HeaderComponent clickPlusChildrenButton() {
        plusChildrenButton.click();
        return this;
    }

    @Step("Click search button")
    public void clickSearchButton() {
        searchButton.click();
    }

    @Step("Click profile button")
    public HeaderComponent openProfileOptions() {
        profileButton.click();
        return new HeaderComponent();
    }

    @Step("Click Увійти button")
    public LoginPopUpComponent clickLoginButton() {
        loginbutton.click();
        return new LoginPopUpComponent();
    }

    @Step("Choose category")
    public CategoriesComponent clickCategories(int index) {
        return new CategoriesComponent($x(format("//*[@id=\"categoryScroller\"]/div/div/div/div[3]/div/div/div/div/label[%s]", index)));
    }

    @Step("Get language components")
    public LanguagePopUpComponent getLanguageComponents(int index) {
        return new LanguagePopUpComponent($x(format("//section[3]/div/ul/li[%s]", index)));
    }

     public String getMyProfileText() {
       return this.myAccountButton.text();

     }

     public String getTranslatedText() {
        return this.hostButton.text();
     }
}
