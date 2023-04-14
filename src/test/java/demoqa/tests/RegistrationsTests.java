package demoqa.tests;

import demoqa.data.FieldsRegistrationsModal;
import demoqa.data.ValuesRegistrationsPageAndModal;
import org.junit.jupiter.api.Test;

public class RegistrationsTests extends TestBase {

    @Test
    void successfulTest() {
        registrationPage.openPage()
                .setFirstName(ValuesRegistrationsPageAndModal.nameValue)
                .setLastName(ValuesRegistrationsPageAndModal.lastNameValue)
                .setUserEmail(ValuesRegistrationsPageAndModal.emailValue)
                .setGender(ValuesRegistrationsPageAndModal.genderValue)
                .setUserNumber(ValuesRegistrationsPageAndModal.numberValue)
                .setBirthDate(ValuesRegistrationsPageAndModal.dayValue, ValuesRegistrationsPageAndModal.monthValue, ValuesRegistrationsPageAndModal.yearValue)
                .setSubject(ValuesRegistrationsPageAndModal.subjectValue)
                .setHobby(ValuesRegistrationsPageAndModal.hobbyValue)
                .uploadPicture(ValuesRegistrationsPageAndModal.pathValue)
                .setAddress(ValuesRegistrationsPageAndModal.addressValue)
                .setState(ValuesRegistrationsPageAndModal.stateValue)
                .setCity(ValuesRegistrationsPageAndModal.cityValue)
                .pressSubmit()
                .verifyRegistrationResultModalAppears()
                .verifyResult(FieldsRegistrationsModal.studentNameField, ValuesRegistrationsPageAndModal.nameValue + " " + ValuesRegistrationsPageAndModal.lastNameValue)
                .verifyResult(FieldsRegistrationsModal.studentEmailField, ValuesRegistrationsPageAndModal.emailValue)
                .verifyResult(FieldsRegistrationsModal.genderField, ValuesRegistrationsPageAndModal.genderValue)
                .verifyResult(FieldsRegistrationsModal.mobileField, ValuesRegistrationsPageAndModal.numberValue)
                .verifyResult(FieldsRegistrationsModal.dateBirthField, ValuesRegistrationsPageAndModal.dayValue + " " + ValuesRegistrationsPageAndModal.monthValue + "," + ValuesRegistrationsPageAndModal.yearValue)
                .verifyResult(FieldsRegistrationsModal.subjectsField, ValuesRegistrationsPageAndModal.subjectValue)
                .verifyResult(FieldsRegistrationsModal.hobbiesField, ValuesRegistrationsPageAndModal.hobbyValue)
                .verifyResult(FieldsRegistrationsModal.pictureField, ValuesRegistrationsPageAndModal.pathValue)
                .verifyResult(FieldsRegistrationsModal.addressField, ValuesRegistrationsPageAndModal.addressValue)
                .verifyResult(FieldsRegistrationsModal.stateCityField, ValuesRegistrationsPageAndModal.stateValue + " " + ValuesRegistrationsPageAndModal.cityValue);
    }
}