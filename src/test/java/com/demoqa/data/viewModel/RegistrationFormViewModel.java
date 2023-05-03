package com.demoqa.data.viewModel;

import com.demoqa.utils.RandomUtils;

public class RegistrationFormViewModel {

    public String nameValue = RandomUtils.getRandomFirstName(),
            lastNameValue = RandomUtils.getRandomLastName(),
            emailValue = RandomUtils.getRandomEmail(),
            genderValue = RandomUtils.getRandomGender(),
            numberValue = RandomUtils.getRandomPhone(),
            monthValue = RandomUtils.getRandomMonth(),
            yearValue = RandomUtils.getRandomYear(),
            dayValue = RandomUtils.getRandomDay(),
            subjectValue = RandomUtils.getRandomSubject(),
            hobbyValue = RandomUtils.getRandomHobby(),
            pathValue = "img.png",
            addressValue = RandomUtils.getRandomAddress(),
            stateValue = RandomUtils.getRandomState(),
            cityValue = RandomUtils.getRandomCity(stateValue);
}