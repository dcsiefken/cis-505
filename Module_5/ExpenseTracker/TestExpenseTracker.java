/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/
package Module_5.ExpenseTracker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TestExpenseTracker class -- driver for testing expense tracking classes
 */
public class TestExpenseTracker {
    public static void main(String[] args) {
        // set up the initial menu
        System.out.println("Welcome to the Expense Tracker");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        String menu = "MENU OPTIONS\r\n" +
                "  1. View Transactions\r\n" +
                "  2. Add Transactions\r\n" +
                "  3. View Expense\r\n\r\n" +
                "Please choose an option: ";

        // repeat while user chooses to continue
        do {
            // read menu option from user prompt
            int option = ValidatorIO.getInt(sc, menu);
            switch (option) {
                case 1:
                    // menu option 1 - view transactions
                    System.out.println();
                    System.out.println("MONTHLY EXPENSES");
                    System.out.println();
                    try {
                        // get all transactions from expenses.txt file and display them
                        for (Transaction tran : new TransactionIO().findAll()) {
                            System.out.println(tran);
                            System.out.println();
                        }
                    } catch (IOException ex) {
                        // print any exceptions that occur during file reading
                        System.out.println("Exception: " + ex.getMessage());
                    }
                    break;
                case 2:
                    // menu option 2 - add transactions
                    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
                    // repeat until user chooses to stop adding transactions
                    do {
                        // prompt for description and amount
                        String description = ValidatorIO.getString(sc, "Enter the description:");
                        double amount = ValidatorIO.getDouble(sc, "Enter the amount:");
                        // add a Transaction object to the arraylist
                        Transaction tran = new Transaction();
                        tran.setAmount(amount);
                        tran.setDescription(description);
                        transactions.add(tran);
                    } while (ValidatorIO.getString(sc, "Add another transaction? (y/n):").equals("y"));
                    try {
                        // add transactions to expenses.txt
                        new TransactionIO().bulkInsert(transactions);
                    } catch (IOException ex) {
                        // print out any exceptions that occur during file writing
                        System.out.println("Exception: " + ex.getMessage());
                    }
                    break;
                case 3:
                    // menu option 3 - view expense
                    try {
                        // calculate running total of all items in expenses.txt
                        double total = 0;
                        for (Transaction tran : new TransactionIO().findAll()) {
                            total += tran.getAmount();
                        }
                        // print running total
                        System.out.println("Your total monthly expense is " + String.format("$%,6.2f", total));
                    } catch (IOException ex) {
                        // print out any exceptions that occur during reading from file
                        System.out.println("Exception: " + ex.getMessage());
                    }
                    break;
                default:
                    break;
            }
            System.out.println();
        } while (ValidatorIO.getString(sc, "Continue? (y/n) ").equals("y"));
    }
}