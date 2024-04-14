/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_5.ExpenseTracker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TransactionIO class - reading/writing transactions to a file
 */
public class TransactionIO {
    // relative file path of transactions file
    private static final String FILE_NAME = "expenses.txt";
    // File object to use for reading/writing transactions
    private File file;

    /**
     * Default constructor
     */
    public TransactionIO() {
        file = new File(FILE_NAME);
    }

    /**
     * Insert multiple transactions into file
     * 
     * @param transactions transactions to insert
     * @throws IOException exception thrown if there are problems writing to file
     */
    public void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        // set up file based on whether or not it already exists
        PrintWriter output = null;
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME)));
        } else {
            output = new PrintWriter(FILE_NAME);
        }
        // loop through all transactions, writing each to file separating with space
        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount() + " ");
        }
        // clean up writer
        output.close();
    }

    /**
     * Get all transactions from file
     * 
     * @return arraylist of transaction objects loaded from file
     * @throws IOException exception thrown if there are problems reading from file
     */
    public ArrayList<Transaction> findAll() throws IOException {
        // set up to read from file
        Scanner input = new Scanner(file);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        // repeat while file has more to read
        while (input.hasNext()) {
            // break apart line on space character
            String[] splitLine = input.nextLine().split(" ");
            // initialize a transaction based on split components
            transactions.add(new Transaction(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2])));
        }
        // clean up and return
        input.close();
        return transactions;
    }
}