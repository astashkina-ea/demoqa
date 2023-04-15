package demoqa.tests;

import demoqa.data.FieldsTextBoxOutput;
import demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static demoqa.data.FieldsTextBoxOutput.*;
import static demoqa.data.ValuesTextBoxPage.*;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void successfulFillFormTest() {
        textBoxPage.openPage()
                .setUserName(nameValue + " " + lastNameValue)
                .setUserEmail(emailValue)
                .setCurrentAddress(currentAddressValue)
                .setPermanentAddress(permanentAddressValue)
                .pressSubmit()
                .verifyResult(nameField, nameValue + " " + lastNameValue).verifyResult(emailField, emailValue)
                .verifyResult(currentAddressField, currentAddressValue)
                .verifyResult(permananetAddressField, permanentAddressValue);
    }
}