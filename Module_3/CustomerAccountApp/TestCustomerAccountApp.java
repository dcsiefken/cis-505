/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_3.CustomerAccountApp;

import java.util.Scanner;

/**
 * Tests the Customer and Account classes
 */
public class TestCustomerAccountApp {
    public static void main(String[] args) {
        // initialize input device
        Scanner input = new Scanner(System.in);
        // prompt for customer id
        System.out.println("Welcome to the Customer Account App\r\n");
        System.out.print("Enter a customer ID:\r\n  ex: 1007, 1008, 1009: ");
        int customerID = Integer.parseInt(input.nextLine());
        System.out.println();
        // create customer and account objects
        Customer customer = CustomerDB.getCustomer(customerID);
        Account account = new Account();

        // loop until finished
        do {
            // prompt for one account action at a time
            executeAccountMenu(input, account);
        } while (continueRunning(input)); // check if finished

        // print out customer and account details
        printSummary(customer, account);

        input.close();
    }

    /**
     * Displays a menu for interacting with account
     */
    public static void displayMenu() {
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
        System.out.print("  Enter option>: ");
    }

    /**
     * Prompts for input and takes appropriate action on account
     * 
     * @param input   input device for prompting user
     * @param account account object to manipulate
     */
    private static void executeAccountMenu(Scanner input, Account account) {
        // display account menu
        displayMenu();
        // prompt for account action
        String selectedOption = input.nextLine();
        System.out.println();
        // based on customer input, execute the appropriate action
        switch (selectedOption) {
            case "b":
            case "B":
                // print current account balance
                System.out.println(String.format("Account balance: $%,6.2f", account.getBalance()));
                break;
            case "d":
            case "D":
                // prompt for, and then execute a deposit
                System.out.print("Enter deposit amount: ");
                double depositAmount = Double.parseDouble(input.nextLine());
                System.out.println();
                account.deposit(depositAmount);
                break;
            case "w":
            case "W":
                // prompt for, then execute a withdrawal
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = Double.parseDouble(input.nextLine());
                System.out.println();
                account.withdraw(withdrawAmount);
                break;
            default:
                // print an error if input was invalid
                System.out.println("Error: Invalid option\r\n");
                break;
        }
    }

    /**
     * Return true if the user wants to continue, otherwise false
     * 
     * @param input Scanner object to read from
     * @return true or false
     */
    private static boolean continueRunning(Scanner input) {
        // Print a prompt for the user
        System.out.print("Continue? (y/n): ");

        // Read their response
        var yesOrNo = input.nextLine();
        System.out.println();

        // Return true or false based on response
        return yesOrNo.equals("y");
    }

    /**
     * Summarize the current customer and account objects
     * 
     * @param customer customer to summarize
     * @param account  account to summarize
     */
    private static void printSummary(Customer customer, Account account) {
        System.out.println("--Customer Details--");
        System.out.println(customer.toString());
        System.out.println(String.format("Balance as of %s is $%,6.2f", account.getTransactionDate(),
                account.getBalance()));
    }

}
