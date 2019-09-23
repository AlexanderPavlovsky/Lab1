package company.Class;

import java.util.Locale;
import java.util.Scanner;
/**
 * Class function utils
 */
public class FunUtils {
    /**
     * Rewrites to US output format and rounding numbers
     * @param number Number
     * @return Reformatting number
     */
    public static String floatFromat (final double number){
        final Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        final String result = String.format("%6.2f", number);
        Locale.setDefault(locale);
        return result;
    }

    /**
     * Is this number double?
     * @param str Input data
     * @return This number is double
     */
    public static double isDouble(final Scanner str) {
        while (!str.hasNextDouble()) {
            System.out.println("That not a number!");
            str.next();
        }
        return str.nextDouble();
    }

    /**
     * Is this number positive?
     * @param str Input data
     * @return This number is positive
     */
    public static int isPositive(final Scanner str) {
        int positive = isInt(str);
        while (positive < 0) {
            System.out.println("That not a positive number!");
            positive = isInt(str);
        }
        return positive;
    }

    /**
     * Is this number int?
     * @param str Input data
     * @return This number is int
     */
    private static int isInt(final Scanner str) {
        while (!str.hasNextInt()) {
            System.out.println("That not a number!");
            str.next();
        }
        return str.nextInt();
    }
}

//