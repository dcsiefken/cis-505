/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_3.CustomerAccountApp;

/**
 * Provides a means of retrieving customer data
 */
public class CustomerDB {
    /**
     * Retrieve a customer object
     * 
     * @param id Customer ID to use as a basis for lookup
     * @return customer object corresponding to ID provided
     */
    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("Bob Robertson", "123 Main Street", "Lincoln", "68516");
        } else if (id == 1008) {
            return new Customer("Jaime Escobar", "321 Elm Street", "Omaha", "68100");
        } else if (id == 1009) {
            return new Customer("Jillian Anderson", "999 Palm Way", "Sunnyville", "90210");
        } else {
            return new Customer();
        }
    }
}
