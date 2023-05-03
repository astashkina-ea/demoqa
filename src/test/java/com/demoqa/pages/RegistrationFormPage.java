package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.data.viewModel.RegistrationFormViewModel;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.RegistrationsFormResultComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    private CalendarComponent calendarComponent = new CalendarComponent();
    private RegistrationsFormResultComponent registrationsFormResultComponent = new RegistrationsFormResultComponent();

    private String studentNameField = "Student Name",
            studentEmailField = "Student Email",
            genderField = "Gender",
            mobileField = "Mobile",
            dateBirthField = "Date of Birth",
            subjectsField = "Subjects",
            hobbiesField = "Hobbies",
            pictureField = "Picture",
            addressField = "Address",
            stateCityField = "State and City",
            sizesTitleField = "Thanks for submitting the form";

    private SelenideElement formHeaderText = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            gender = $("#genterWrapper"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            userNumberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitBtn = $("#submit");

    //ElementsCollection elementsCollection = $$("");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        formHeaderText.shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationFormPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value) {
        gender.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationFormPage setSubject(String value) {
        subjectInput.sendKeys(value);
        subjectInput.pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbiesWrapper(String value) {
        hobbiesWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage uploadPicture(String value) {
        uploadPicture.uploadFromClasspath("img/" + value);
        return this;
    }

    public RegistrationFormPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setState(String value) {
        stateInput.click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setCity(String value) {
        cityInput.click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationFormPage pressSubmit() {
        submitBtn.click();
        return this;
    }

    public RegistrationFormPage verifyRegistrationResultModalAppears() {
        registrationsFormResultComponent.verifyModalAppears(sizesTitleField);
        return this;
    }

    public RegistrationFormPage verifyResult(RegistrationFormViewModel value) {
        registrationsFormResultComponent.verifyResult(studentNameField, value.nameValue + " " + value.lastNameValue)
                .verifyResult(studentEmailField, value.emailValue)
                .verifyResult(genderField, value.genderValue)
                .verifyResult(mobileField, value.numberValue)
                .verifyResult(dateBirthField, value.dayValue + " " + value.monthValue + "," + value.yearValue)
                .verifyResult(subjectsField, value.subjectValue)
                .verifyResult(hobbiesField, value.hobbyValue)
                .verifyResult(pictureField, value.pathValue)
                .verifyResult(addressField, value.addressValue)
                .verifyResult(stateCityField, value.stateValue + " " + value.cityValue);
        return this;
    }
}