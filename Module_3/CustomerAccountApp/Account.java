/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
    Attribution to https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
*/

package Module_3.CustomerAccountApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Models a financial account
 */
public class Account {
    // Balance of account
    private double balance = 200;

    /**
     * Accessor for Balance
     * 
     * @return balance of account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds amount to current balance
     * 
     * @param amt amount to add
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * Subtracts amount (if possible) from current balance
     * 
     * @param amt amount to subtract
     */
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    /**
     * Gets the current date as a String
     * 
     * @return current date in MM-dd-yyyy format
     */
    public String getTransactionDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
}
