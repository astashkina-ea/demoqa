package com.demoqa.tests;

import com.demoqa.data.viewModel.TextBoxViewModel;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxViewModel textBoxViewModel = new TextBoxViewModel();

    @Test
    @Tag("remote")
    @DisplayName("Успешное заполнение формы Text box")
    void successfulFillFormTest() {

        step("Открыть форму", () -> {
            textBoxPage.openPage();
        });
        step("Заполнить форму", () -> {
        textBoxPage.setUserName(textBoxViewModel.nameValue + " " + textBoxViewModel.lastNameValue)
                .setUserEmail(textBoxViewModel.emailValue)
                .setCurrentAddress(textBoxViewModel.currentAddressValue)
                .setPermanentAddress(textBoxViewModel.permanentAddressValue)
                .pressSubmit();
        });
        step("Проверить результат", () -> {
            textBoxPage.verifyResult(textBoxPage.nameField, textBoxViewModel.nameValue + " " + textBoxViewModel.lastNameValue)
                    .verifyResult(textBoxPage.emailField, textBoxViewModel.emailValue)
                    .verifyResult(textBoxPage.currentAddressField, textBoxViewModel.currentAddressValue)
                    .verifyResult(textBoxPage.permananetAddressField, textBoxViewModel.permanentAddressValue);
        });
    }
}
