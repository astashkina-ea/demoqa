package com.demoqa.data.viewModel;

import com.demoqa.utils.RandomUtils;

public class TextBoxViewModel {

    public String nameValue = RandomUtils.getRandomFirstName(),
            lastNameValue = RandomUtils.getRandomLastName(),
            emailValue = RandomUtils.getRandomEmail(),
            currentAddressValue = RandomUtils.getRandomAddress(),
            permanentAddressValue = RandomUtils.getRandomAddress();
}