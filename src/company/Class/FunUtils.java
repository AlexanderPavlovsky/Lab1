package company.Class;

import java.util.Locale;
import java.util.Scanner;

public class FunUtils {
    public static String floatFromat (final double number){
        Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        String result = String.format("%6.2f", number);
        Locale.setDefault(locale);
        return result;
    }
    public static double isDouble(final Scanner str) {
        while (!str.hasNextDouble()) {
            System.out.println("That not a number!");
            str.next();
        }
        return str.nextDouble();
    }

    public static int isPositive(final Scanner str) {
        int positive = isInt(str);
        while (positive < 0) {
            System.out.println("That not a positive number!");
            positive = isInt(str);
        }
        return positive;
    }

    private static int isInt(final Scanner str) {
        while (!str.hasNextInt()) {
            System.out.println("That not a number!");
            str.next();
        }
        return str.nextInt();
    }
}

