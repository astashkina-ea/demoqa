package lesson.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/text-box");
//        $("[id=userName]").setValue("Mr Fedor"); //вводим текст
        $("#userName").setValue("Mr Fedor");
        $("#userEmail").setValue("fedor@test.ru");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Some street 2");
        $("#submit").click();

        $("#output").shouldHave(text("Mr Fedor"), text("fedor@test.ru"),
                text("Some street 1"), text("Some street "));

        $("#output #name").shouldHave(text("Mr Fedor"));
    }
}
