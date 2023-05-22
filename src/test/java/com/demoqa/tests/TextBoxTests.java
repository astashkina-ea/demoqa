package com.demoqa.tests;

import com.demoqa.data.viewModel.TextBoxViewModel;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxViewModel textBoxViewModel = new TextBoxViewModel();

    @Test
    void successfulFillFormTest() {
        textBoxPage.openPage()
                .setUserName(textBoxViewModel.nameValue + " " + textBoxViewModel.lastNameValue)
                .setUserEmail(textBoxViewModel.emailValue)
                .setCurrentAddress(textBoxViewModel.currentAddressValue)
                .setPermanentAddress(textBoxViewModel.permanentAddressValue)
                .pressSubmit();

        textBoxPage.verifyResult(textBoxPage.nameField, textBoxViewModel.nameValue + " " + textBoxViewModel.lastNameValue)
                .verifyResult(textBoxPage.emailField, textBoxViewModel.emailValue)
                .verifyResult(textBoxPage.currentAddressField, textBoxViewModel.currentAddressValue)
                .verifyResult(textBoxPage.permananetAddressField, textBoxViewModel.permanentAddressValue);
    }
}
