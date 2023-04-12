package homework.demoqa;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests extends TestBase {

    @Test
    void successfulTest() {

        String firstName = "Test";
        String lastName = "Testov";
        String email = "test@test.ru";
        String gender = "Male";
        String number = "1231231230";
        String month = "February";
        String year = "1999";
        String day = "15";
        String subject = "Hindi";
        String hobby = "Sports";
        String address = "Test, 1-2";
        String state = "NCR";
        String city = "Delhi";

        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(number);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText(month)).click();
        $(".react-datepicker__year-select").$(byText(year)).click();
        $(String.format(".react-datepicker__day--0%s", day)).click();
        $("#subjectsInput").sendKeys(subject);
        $("#subjectsInput").pressEnter();
        $("#hobbiesWrapper").$(byText(hobby)).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img.png"));
        //$("#uploadPicture").uploadFromClasspath("img.png");
        $("#currentAddress").setValue(address);
        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();
        $("#submit").click();
        $(".table-responsive").shouldHave(
                text(firstName),
                text(lastName),
                text(email),
                text(gender),
                text(number),
                text(day + " " + month + "," + year),
                text(subject),
                text(hobby),
                text("img.png"),
                text(address),
                text(state + " " + city));
    }
}
