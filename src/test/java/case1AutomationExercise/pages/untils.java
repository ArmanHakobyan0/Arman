package case1AutomationExercise.pages;

import java.util.Random;

public class untils {
    public static String generateRandomString(int length, String chars) {
        String randomStr = "";
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            randomStr += chars.charAt(r.nextInt(chars.length()));
        }
        return randomStr;
    }


    public static String randomAlpha(int length) {
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        while (true) {
            randomString = generateRandomString(length, alpha);
            if (isAllowed(randomString)) {
                return randomString;
            } else break;
        }
        return randomString;
    }


    public static boolean isAllowed(String randomText) {

        String[] disallowed = {"google", "facebook", "yahoo", "gmail", "hotmail", "skype", "mail", "wevegotmail", "freeola", "mydomain", "yourdomain", "homeco", "mixit", "gmx", "googlemail", "msn", "messenger", "href", ".com", "ftp", ".za", ".co", ".uk", "burntmail", "fastmail", "fusemail", "gnumail", "@"};

        for (int i = 0; i < disallowed.length; i++) {
            if (randomText.contains(disallowed[i])) {
                return false;
            }
        }
        return true;

    }
}
