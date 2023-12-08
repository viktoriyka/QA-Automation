package Project;

import Objects.HomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HomePageTests extends BaseTest {

    @Test(description = "Verify successful search process")
    @Description("Verify successful search process with location and amount of guests")
    public void search(){

        HomePage homePage = new HomePage();

               homePage.goTo()
                       .headerComponent
                       .inputLocation("Лондон")
                       .clickGuestPopUpButton()
                       .clickPlusAdultButton()
                       .clickPlusChildrenButton()
                       .clickSearchButton();

               assertTrue(homePage.isEnabledAccomodation(), "Accomodation is not enabled");
    }

    @Test(description = "Verify successful login")
    @Description("Verify successful login using email: kleponosova09@gmail.com and password: 123lo3z99")
    public void login() {

        HomePage homePage = new HomePage();

        homePage.goTo()
                .headerComponent
                .openProfileOptions()
                .clickLoginButton()
                .clickUseEmailButton()
                .inputEmail("kleponosova09@gmail.com")
                .clickContinueButton()
                .inputPassword("123lo3z99")
                .clickLoginButton()
                .openProfileOptions();

        assertEquals(homePage.headerComponent.getMyProfileText(), "Акаунт","Account button should have text: Акаунт");

    }

    @Test(description = "Verify successful search process by category")
    @Description("Verify successful search process with selected category")
    public void categorySearch() {

        HomePage homePage = new HomePage();

        homePage.goTo()
                .headerComponent
                .clickCategories(5)
                .selectCategory();

        assertTrue(homePage.isEnabledSelectedAccomodation(), "Accomodations on the selected category is not enabled");
    }

    @Test(description = "Verify successful language change")
    @Description("Verify successful change the selected language")
    public void changeLanguage() {

        HomePage homePage = new HomePage();

        homePage.goTo()
                .headerComponent
                .clickLanguageButton()
                .getLanguageComponents(5)
                .selectLanguage();

        assertEquals(homePage.headerComponent.getTranslatedText(), "Fes Airbnb a casa", "Translated page should have text: Fes Airbnb a casa");
    }
}
