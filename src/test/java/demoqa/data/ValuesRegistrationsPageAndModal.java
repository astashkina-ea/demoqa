package demoqa.data;

import com.github.javafaker.Faker;
import demoqa.utils.RandomUtils;

import java.util.Locale;

import static demoqa.utils.RandomUtils.*;

public class ValuesRegistrationsPageAndModal {

    private static Faker faker = new Faker(new Locale("ru"));

    public static String
            nameValue = getRandomFirstName(),
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