/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

import java.util.Scanner;

/**
 * Driver application to test out bowling product inventory classes
 */
public class TestBowlingShopApp {
    public static void main(String[] args) {
        // set up input device
        Scanner input = new Scanner(System.in);

        String option; // option chosen by user from menu
        do {
            // display the choices to the user
            displayMenu();
            // get user's choice
            System.out.print("Please choose an option: ");
            option = input.nextLine();
            System.out.println();
            // look up products for the provided code, if any
            GenericQueue<Product> products = ProductDB.getProducts(option);
            // print a header if there are any products to list
            if (products.Size() > 0) {
                System.out.println("--Product Listing--");
            }
            // list all fields for all products until queue is empty
            while (products.Size() > 0) {
                System.out.println(products.Dequeue());
            }
        } while (!option.equals("x"));
        // close input device
        input.close();
    }

    /**
     * Displays a friendly menu for the app
     */
    public static void displayMenu() {
        System.out.println("MENU OPTIONS");
        System.out.println("  1. <b> Bowling Balls");
        System.out.println("  2. <a> Bowling Bags");
        System.out.println("  3. <s> Bowling Shoes");
        System.out.println("  4. <x> To exit");
    }

}
