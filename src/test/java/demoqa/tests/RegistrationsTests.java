package demoqa.tests;

import demoqa.data.FieldsRegistrationsModal;
import demoqa.data.ValuesRegistrationsPageAndModal;
import org.junit.jupiter.api.Test;

import static demoqa.data.FieldsRegistrationsModal.*;
import static demoqa.data.ValuesRegistrationsPageAndModal.*;

public class RegistrationsTests extends TestBase {

    @Test
    void successfulTest() {
        registrationPage.openPage()
                .setFirstName(nameValue)
                .setLastName(lastNameValue)
                .setUserEmail(emailValue)
                .setGender(genderValue)
                .setUserNumber(numberValue)
                .setBirthDate(dayValue, monthValue, yearValue)
                .setSubject(subjectValue)
                .setHobby(hobbyValue)
                .uploadPicture(pathValue)
                .setAddress(addressValue)
                .setState(stateValue)
                .setCity(cityValue)
                .pressSubmit()
                .verifyRegistrationResultModalAppears()
                .verifyResult(studentNameField, nameValue + " " + lastNameValue)
                .verifyResult(studentEmailField, emailValue)
                .verifyResult(genderField, genderValue)
                .verifyResult(mobileField, numberValue)
                .verifyResult(dateBirthField, dayValue + " " + monthValue + "," + yearValue)
                .verifyResult(subjectsField, subjectValue)
                .verifyResult(hobbiesField, hobbyValue)
                .verifyResult(pictureField, pathValue)
                .verifyResult(addressField, addressValue)
                .verifyResult(stateCityField, stateValue + " " + cityValue);
    }
}