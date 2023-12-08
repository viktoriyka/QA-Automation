package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccomodationComponent {
    private SelenideElement saveToWishlistButton;
    private SelenideElement photoOfAccomodation;
    private SelenideElement previousPhotoButton;
    private SelenideElement nextPhotoButton;
    private SelenideElement cityAndCountry;
    private SelenideElement distanceFromSelectedCountry;
    private SelenideElement nearestAvailableDate;
    private SelenideElement pricePerNight;
    private SelenideElement rating;
    private SelenideElement cardOfAccomodation;
    private SelenideElement accomodationComponent;

    public AccomodationComponent(SelenideElement element) {
        this.cardOfAccomodation = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div");
        this.saveToWishlistButton = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div/button");
        this.photoOfAccomodation = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/a[2]/div/div/picture/img");
        this.previousPhotoButton = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]");
        this.nextPhotoButton = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]");
        this.cityAndCountry = $x("//*[@id=\"title_51629846\"]");
        this.distanceFromSelectedCountry = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[2]");
        this.nearestAvailableDate = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[3]/span/span");
        this.pricePerNight = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[4]");
        this.rating = $x("//*[@id=\"site-content\"]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[2]/span");
        this.accomodationComponent = element;
    }
    public void clickAccomodation() {
        accomodationComponent.click();

    }

    public void clickWishListButton() {
        saveToWishlistButton.click();
    }

    public void clickNextPhotoButton() {
        nextPhotoButton.click();
    }

    public void clickPriviousPhotoButton() {
        previousPhotoButton.click();
    }

    public void clickOnAccomodationPage() {
        cardOfAccomodation.click();
    }

    public String getAccommodationPrice() {
        return pricePerNight.text();
    }


}
