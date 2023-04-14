package demoqa.utils;

import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    private static String[] genders = {"Male", "Female", "Other"};

    private static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static String[] hobby = {
            "Sports", "Reading", "Music"
    };
    private static String[] state = {
            "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"
    };
    private static String[] subject = {
            "Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
            "Biology", "Computer Science", "Commerce", "Accounting", "Economics",
            "Arts", "Social Studies", "History", "Civics"
    };
    public static String[] cityNCR = new String[]{
            "Delhi", "Gurgaon", "Noida"
    };
    public static String[] cityUttarPradesh = new String[]{
            "Agra", "Lucknow", "Merrut"
    };
    public static String[] cityHaryana = new String[]{
            "Karnal", "Panipat"
    };
    public static String[] cityRajasthan = new String[]{
            "Jaipur", "Jaiselmer"
    };

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

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

//    public static String getRandomPhone() {
//        return "+5 (9" + getRandomInt(11, 99) + ") " + getRandomInt(1111, 9999) + " - " + getRandomInt(111, 999);
//    }
//
//    public static Long getRandomLong() {
//        return null; // todo realise
//    }

    private static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length - 1);
        return values[index];
    }

    public static String getRandomFirstName() {
        return new Faker().name().firstName();
    }

    public static String getRandomLastName() {
        return new Faker().name().lastName();
    }

    public static String getRandomEmail() {
        return new Faker().internet().emailAddress("en");
    }

    public static String getRandomGender() {
        return getRandomItemFromArray(genders);
    }

    public static String getRandomPhone() {
        return new Faker().numerify("##########");
    }

    public static String getRandomMonth() {
        return getRandomItemFromArray(months);
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
        return getRandomItemFromArray(subject);
    }

    public static String getRandomHobby() {
        return getRandomItemFromArray(hobby);
    }

    public static String getRandomAddress() {
        return new Faker().address().fullAddress();
    }

    public static String getRandomState() {
        return getRandomItemFromArray(state);
    }

    public static String getRandomCity(String state) {
        String city;
        switch (state) {
            case "NCR": {
                city = getRandomItemFromArray(cityNCR);
                return city;
            }
            case "Uttar Pradesh": {
                city = getRandomItemFromArray(cityUttarPradesh);
                return city;
            }
            case "Haryana": {
                city = getRandomItemFromArray(cityHaryana);
                return city;
            }
            case "Rajasthan": {
                city = getRandomItemFromArray(cityRajasthan);
                return city;
            }
        }
        return null;
    }
}