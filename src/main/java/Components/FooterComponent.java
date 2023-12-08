package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FooterComponent {
    public SelenideElement footer;
    public SelenideElement helpCenterButton;
    public SelenideElement airCoverButton;
    public SelenideElement antiDiscriminationButton;
    public SelenideElement disabilitySupportButton;
    public SelenideElement cancellationOptionsButton;
    public SelenideElement reportNeighborhoodConcernButton;
    public SelenideElement airbnbYourHomeButton;
    public SelenideElement airCoverForHostsButton;
    public SelenideElement hostingResourcesButton;
    public SelenideElement communityForumButton;
    public SelenideElement hostingResponsiblyButton;
    public SelenideElement newsButton;
    public SelenideElement newFeaturesButton;
    public SelenideElement careersButton;
    public SelenideElement investorsButton;
    public SelenideElement airbnbTemporaryStaysButton;
    public SelenideElement languageAndCountryButton;
    public SelenideElement currencyButton;
    public SelenideElement facebookButton;
    public SelenideElement twitterButton;
    public SelenideElement instagramButton;
    public SelenideElement privacyButton;
    public SelenideElement conditionsButton;
    public SelenideElement siteMapButton;

    public FooterComponent(){
        this.footer = $x("//footer");
        this.helpCenterButton = $x("//section[1]/ul/li[1]/a");
        this.airCoverButton = $x("//section[1]/ul/li[2]/a");
        this.antiDiscriminationButton = $x("//section[1]/ul/li[3]/a");
        this.disabilitySupportButton = $x("//section[1]/ul/li[4]/a");
        this.cancellationOptionsButton = $x("//section[1]/ul/li[5]/a");
        this.reportNeighborhoodConcernButton = $x("//section[1]/ul/li[6]/a");
        this.airbnbYourHomeButton = $x("//section[2]/ul/li[1]/a");
        this.airCoverForHostsButton = $x("//section[2]/ul/li[2]/a");
        this.hostingResourcesButton = $x("//section[2]/ul/li[3]/a");
        this.communityForumButton = $x("//section[2]/ul/li[4]/a");
        this.hostingResponsiblyButton = $x("//section[2]/ul/li[5]/a");
        this.newsButton = $x("//section[3]/ul/li[1]/a");
        this.newFeaturesButton = $x("//section[3]/ul/li[2]/a");
        this.careersButton = $x("//section[3]/ul/li[3]/a");
        this.investorsButton = $x("//section[3]/ul/li[4]/a");
        this.airbnbTemporaryStaysButton = $x("//section[3]/ul/li[5]/a");
        this.languageAndCountryButton = $x("//div[2]/div[1]/div[1]/span[1]/button");
        this.currencyButton = $x("//div[2]/div[1]/div[1]/span[2]/button");
        this.facebookButton = $x("//div[1]/div[2]/ul/li[1]/a");
        this.twitterButton = $x("//div[1]/div[2]/ul/li[2]/a");
        this.instagramButton = $x("//div[1]/div[2]/ul/li[3]/a");
        this.privacyButton = $x("//div[2]/div/div/div[2]/span[2]/ol/li[1]");
        this.conditionsButton = $x("/div[2]/div/div/div[2]/span[2]/ol/li[2]");
        this.siteMapButton = $x("/div[2]/div/div/div[2]/span[2]/ol/li[3]");
    }

    public void clickHelpCenterButton() {
        helpCenterButton.click();
    }
    public void clickAirCoverButton() {
        airCoverButton.click();
    }
    public void clickAntiDiscriminationButton() {
        antiDiscriminationButton.click();
    }
    public void clickDisabilitySupportButton() {
        disabilitySupportButton.click();
    }
    public void clickCancellationOptionsButton() {
        cancellationOptionsButton.click();
    }
    public void clickReportNeighborhoodConcernButton() {
        reportNeighborhoodConcernButton.click();
    }
    public void clickAirbnbYourHomeButton() {
        airbnbYourHomeButton.click();
    }
    public void clickAirCoverForHostsButton() {
        airCoverForHostsButton.click();
    }
    public void clickHostingResourcesButton() {
        hostingResourcesButton.click();
    }
    public void clickCommunityForumButton() {
        communityForumButton.click();
    }
    public void clickHostingResponsiblyButton() {
        hostingResponsiblyButton.click();
    }
    public void clickNewsButton() {
        newsButton.click();
    }
    public void clickNewFeaturesButton() {
        newFeaturesButton.click();
    }
    public void clickCareersButton() {
        careersButton.click();
    }
    public void clickInvestorsButton() {
        investorsButton.click();
    }
    public void clickAirbnbTemporaryStaysButton() {
        airbnbTemporaryStaysButton.click();
    }
    public void clickLanguageAndCountryButton() {
        languageAndCountryButton.click();
    }
    public void clickCurrencyButton() {
        currencyButton.click();
    }
    public void clickFacebookButton() {
        facebookButton.click();
    }
    public void clickTwitterButton() {
        twitterButton.click();
    }
    public void clickInstagramButton() {
        instagramButton.click();
    }
    public void clickPrivacyButton() {
        privacyButton.click();
    }
    public void clickConditionsButton() {
        conditionsButton.click();
    }
    public void clickSiteMapButton() {
        siteMapButton.click();
    }
}
