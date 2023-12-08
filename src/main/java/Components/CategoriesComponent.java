package Components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class CategoriesComponent {
    private SelenideElement categoriesComponent;

    public CategoriesComponent(SelenideElement element) {
        this.categoriesComponent = element;
    }

    @Step("Click on the category")
    public void selectCategory() {
        categoriesComponent.click();

    }
}
