package demoqa.data;

import com.github.javafaker.Faker;
import demoqa.utils.RandomUtils;

import java.util.Locale;

public class ValuesTextBoxPage {

    private static Faker faker = new Faker(new Locale("ru"));

    public static String nameValue = RandomUtils.getRandomFirstName(),
            lastNameValue = RandomUtils.getRandomLastName(),
            emailValue = RandomUtils.getRandomEmail(),
            currentAddressValue = RandomUtils.getRandomAddress(),
            permanentAddressValue = RandomUtils.getRandomAddress();
}