package Components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class LanguagePopUpComponent {
    private List<SelenideElement> languages;
    private SelenideElement languagePopUpComponent;

    public LanguagePopUpComponent(SelenideElement element) {
        this.languages = $$x("//*[@id=\"panel--language_region_and_currency--0\"]/section[3]/div/ul");
        this.languagePopUpComponent = element;
    }

    @Step("Select language")
    public void selectLanguage(){
        languagePopUpComponent.click();
    }

}
