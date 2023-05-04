package com.demoqa.tests;

import com.demoqa.data.viewModel.RegistrationFormViewModel;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegistrationsTests extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationFormViewModel registrationFormViewModel = new RegistrationFormViewModel();

    @Test
    @Tag("remote")
    void successfulTest() {
        registrationFormPage.openPage()
                .removeBanner()
                .setFirstName(registrationFormViewModel.nameValue)
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

        registrationFormPage.verifyRegistrationResultModalAppears()
                .verifyResult(registrationFormViewModel);
    }
}