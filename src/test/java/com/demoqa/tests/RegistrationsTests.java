package com.demoqa.tests;

import com.demoqa.data.viewModel.RegistrationFormViewModel;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationsTests extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationFormViewModel registrationFormViewModel = new RegistrationFormViewModel();

    @Test
    @Tag("remote")
    @DisplayName("Успешное заполнение формы")
    void successfulTest() {
        step("Открыть форму", () -> {
            registrationFormPage.openPage()
                    .removeBanner();
        });
        step("Заполнить форму", () -> {
            registrationFormPage.setFirstName(registrationFormViewModel.nameValue)
                    .setLastName(registrationFormViewModel.lastNameValue)
                    .setUserEmail(registrationFormViewModel.emailValue)
                    .setGender(registrationFormViewModel.genderValue)
                    .setUserNumber(registrationFormViewModel.numberValue)
                    .setBirthDate(registrationFormViewModel.dayValue, registrationFormViewModel.monthValue, registrationFormViewModel.yearValue)
                    .setSubject(registrationFormViewModel.subjectValue)
                    .setHobbiesWrapper(registrationFormViewModel.hobbyValue)
                    .uploadPicture(registrationFormViewModel.pathValue)
                    .setAddress(registrationFormViewModel.addressValue)
                    .setState(registrationFormViewModel.stateValue)
                    .setCity(registrationFormViewModel.cityValue)
                    .pressSubmit();
        });
        step("Проверить результат", () -> {
            registrationFormPage.verifyRegistrationResultModalAppears()
                    .verifyResult(registrationFormViewModel);
        });
    }
}