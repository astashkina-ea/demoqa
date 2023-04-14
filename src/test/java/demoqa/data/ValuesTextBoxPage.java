package demoqa.data;

import com.github.javafaker.Faker;
import demoqa.utils.RandomUtils;

import java.util.Locale;

import static demoqa.utils.RandomUtils.*;

public class ValuesTextBoxPage {

    private static Faker faker = new Faker(new Locale("ru"));

    public static String nameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            currentAddressValue = getRandomAddress(),
            permanentAddressValue = getRandomAddress();
}