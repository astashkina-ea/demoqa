package demoqa.data.viewModel;

import static demoqa.utils.RandomUtils.*;

public class RegistrationFormViewModel {

    public String nameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            genderValue = getRandomGender(),
            numberValue = getRandomPhone(),
            monthValue = getRandomMonth(),
            yearValue = getRandomYear(),
            dayValue = getRandomDay(),
            subjectValue = getRandomSubject(),
            hobbyValue = getRandomHobby(),
            pathValue = "img.png",
            addressValue = getRandomAddress(),
            stateValue = getRandomState(),
            cityValue = getRandomCity(stateValue);
}