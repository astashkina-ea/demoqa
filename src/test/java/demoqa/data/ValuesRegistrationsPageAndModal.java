package demoqa.data;

import com.github.javafaker.Faker;
import demoqa.utils.RandomUtils;

import java.util.Locale;

public class ValuesRegistrationsPageAndModal {

    private static Faker faker = new Faker(new Locale("ru"));

    public static String
            nameValue = RandomUtils.getRandomFirstName(),
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