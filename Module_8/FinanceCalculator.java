/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_8;

/**
 * Class for calculating certain types of recurring payments.
 */
public class FinanceCalculator {
    /* constant values */
    private static final int MONTHS_IN_YEAR = 12;

    /**
     * Calculate the future value
     * @param monthlyPayment amount paid every month
     * @param rate rate of interest
     * @param years years to pay off amount
     * @return
     */
    public static double calculateFutureValue(double monthlyPayment, double rate, int years){
        // total months
        int months = years * MONTHS_IN_YEAR;
        // interest rate as a percentage
        double interestRate = 1 + rate / 100;
        // total amount
        double presentValue = monthlyPayment * months;
        // future value based on monthly interest accrual
        double futureValue = presentValue * Math.pow(interestRate, months);
        return futureValue;
    }
}
