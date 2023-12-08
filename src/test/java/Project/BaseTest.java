package Project;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static Utils.PropetyHelper.*;
import static Utils.PropetyHelper.getPageLoadTimeout;

public class BaseTest {
    @BeforeClass
    protected void setBrowser() {
        Configuration.browser = getBrowserProperty();
        Configuration.browserSize = getBrowserSizeProperty();
        Configuration.timeout = getTimeoutProperty();
        Configuration.pageLoadTimeout = getPageLoadTimeout();
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
