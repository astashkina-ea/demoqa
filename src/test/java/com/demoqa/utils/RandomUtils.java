package com.demoqa.utils;

import com.demoqa.data.enums.*;
import com.github.javafaker.Faker;
import com.demoqa.data.enums.*;
import com.demoqa.data.enums.cities.CitiesHaryanaEnum;
import com.demoqa.data.enums.cities.CitiesNCREnum;
import com.demoqa.data.enums.cities.CitiesRajasthanEnum;
import com.demoqa.data.enums.cities.CitiesUttarProdeshEnum;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    private static Faker fakerRu = new Faker(new Locale("ru"));
    private static Faker fakerEn = new Faker(new Locale("en"));

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
        int index = getRandomInt(0,enumClass.getEnumConstants().length - 1);
        return enumClass.getEnumConstants()[index];
    }

    public static String getRandomFirstName() {
        return fakerRu.name().firstName();
    }

    public static String getRandomLastName() {
        return fakerRu.name().lastName();
    }

    public static String getRandomEmail() {
        return fakerEn.internet().emailAddress();
    }

    public static String getRandomGender() {
        return getRandomEnum(GendersEnum.class).getName();
    }

    public static String getRandomPhone() {
        return fakerRu.numerify("##########");
    }

    public static String getRandomMonth() {
        return getRandomEnum(MonthsEnum.class).getName();
    }

    public static String getRandomYear() {
        return Integer.toString(getRandomInt(1900, 2100));
    }

    public static String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + Integer.toString(day);
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRandomSubject() {
        return getRandomEnum(SubjectsEnum.class).getName();
    }

    public static String getRandomHobby() {
        return getRandomEnum(HobbiesEnum.class).getName();
    }

    public static String getRandomAddress() {
        return fakerEn.address().fullAddress();
    }

    public static String getRandomState() {
        return getRandomEnum(StatesEnum.class).getName();
    }

    public static String getRandomCity(String state) {
        String city;
        switch (state) {
            case "NCR": {
                city = getRandomEnum(CitiesNCREnum.class).getName();
                return city;
            }
            case "Uttar Pradesh": {
                city = getRandomEnum(CitiesUttarProdeshEnum.class).getName();
                return city;
            }
            case "Haryana": {
                city = getRandomEnum(CitiesHaryanaEnum.class).getName();
                return city;
            }
            case "Rajasthan": {
                city = getRandomEnum(CitiesRajasthanEnum.class).getName();
                return city;
            }
        }
        return null;
    }
}

//    public static String getRandomUuid() {
//        String uuid = UUID.randomUUID().toString();
//        return "uuid = " + uuid;
//    }

//    public static String getRandomString(int len) {
////        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        SecureRandom rnd = new SecureRandom();
//
//        StringBuilder sb = new StringBuilder(len);
//        for (int i = 0; i < len; i++)
//            sb.append(AB.charAt(rnd.nextInt(AB.length())));
//        return sb.toString();
//    }

//    public static String getRandomEmail() {
//        return getRandomString(10) + "@qa.guru";
//    }

//    public static String getRandomPhone() {
//        return "+5 (9" + getRandomInt(11, 99) + ") " + getRandomInt(1111, 9999) + " - " + getRandomInt(111, 999);
//    }
//
//    public static Long getRandomLong() {
//        return null; // todo realise
//    }

//    private static String getRandomItemFromArray(String[] values) {
//        int index = getRandomInt(0, values.length - 1);
//        return values[index];
//    }