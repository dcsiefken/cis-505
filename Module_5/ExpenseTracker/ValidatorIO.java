/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_5.ExpenseTracker;

import java.util.Scanner;

/**
 * ValidatorIO class - read and validate input from user
 */
public class ValidatorIO {
    /**
     * Prompt user for integer input
     * 
     * @param sc     Scanner object
     * @param prompt prompt to display
     * @return integer value
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;
        // repeat until a valid integer is read from input
        while (!isValid) {
            // print prompt and read input
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                // notify user of error if not an integer
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * prompt user for double input
     * 
     * @param sc     Scanner object
     * @param prompt text to display to user
     * @return valid double value read from user
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;
        boolean isValid = false;
        // repeat until a valid double is read from input
        while (!isValid) {
            // print prompt and read input
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                // notify user of error if not valid input
                System.out.println("\n  Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * read a string from input
     * 
     * @param sc     Scanner object
     * @param prompt text to display to user
     * @return string read from input
     */
    public static String getString(Scanner sc, String prompt) {
        // prompt and return input
        System.out.print(prompt);
        return sc.next();
    }
}