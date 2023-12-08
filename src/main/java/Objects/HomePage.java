package Objects;

import Components.AccomodationComponent;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class HomePage extends BasePage{

    private SelenideElement accomodation;
    private SelenideElement selectedAccomodation;

    public HomePage() {
        this.accomodation = $x("//*[@id=\"site-content\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/a");
        this.selectedAccomodation = $x("//*[@id=\"site-content\"]/div[2]/div[1]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/a");
    }

    @Step("Open the site Airbnb")
    public HomePage goTo(){
        open("https://www.airbnb.com.ua/");
        return this;
    }
    public AccomodationComponent selectAccomodation(int index) {
        return new AccomodationComponent($x(format("//*[@id=\"site-content\"]/div[2]/div[1]/div/div/div/div[1]/div[4]", index)));
    }

    public boolean isEnabledAccomodation() {
        return this.accomodation.isEnabled();
    }

    public boolean isEnabledSelectedAccomodation() {
        return this.selectedAccomodation.isEnabled();
    }
}