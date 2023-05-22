package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = System.getProperty("baseUrl", "https://demoqa.com");
        String[] browser = System.getProperty("browser", "chrome:100.0").split(":");
        Configuration.browser = browser[0];
        Configuration.browserVersion = browser[1];
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        String selenoidUrl = System.getProperty("selenoidUrl");
        String login = System.getProperty("login");
        String password = System.getProperty("password");
        Configuration.remote = String.format("https://%s:%s@%s", login, password, selenoidUrl); // адрес селенойда, где запускаются тесты
        //gradle remote -DbaseUrl=https://demoqa.com -Dbrowser=chrome:100.0 -DbrowserSize=1920x1080 -DselenoidUrl=selenoid.autotests.cloud/wd/hub -Dlogin=user1 -Dpassword=1234

        //задаем для selenoid набор опций
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true, //чтобы отображалось в селенейде, что внутри просиходит
                "enableVideo", true //чтобы писалась запись видео
        ));

        Configuration.browserCapabilities = capabilities;
        //Configuration.timeout = 10000;
        //Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}