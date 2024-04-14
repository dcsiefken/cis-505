/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_5.ExpenseTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Transaction class - model of a financial transaction
 */
public class Transaction {
    // date of transaction
    private String date;
    // description of transaction
    private String description;
    // dollar amount of transaction
    private double amount;

    /**
     * Default constructor for Transaction
     */
    public Transaction() {
        // current date in MM-dd-yyyy format
        date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        description = "";
        amount = 0;
    }

    /**
     * Parameter constructor for Transaction
     * 
     * @param date        date of transaction
     * @param description description of transaction
     * @param amount      dollar amount of transaction
     */
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    /**
     * Override of toString() - friendly display of transaction properties
     */
    @Override
    public String toString() {
        return "Date:        " + date + "\r\n" +
                "Description: " + description + "\r\n" +
                "Amount:      " + String.format("$%,6.2f", amount) + "\r\n";
    }

    /**
     * @return String return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return double return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
