package demoqa.data.viewModel;

import static demoqa.utils.RandomUtils.*;

public class TextBoxViewModel {

    public String nameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            currentAddressValue = getRandomAddress(),
            permanentAddressValue = getRandomAddress();
}