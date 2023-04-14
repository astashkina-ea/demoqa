package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.pages.RegistrationPage;
import demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        //Configuration.browser = "chrome";
        //Configuration.timeout = 10000;
        //Configuration.holdBrowserOpen = true;
    }
}