/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_3.CustomerAccountApp;

/**
 * Models a Customer (person)
 */
public class Customer {
    // Name of customer
    private String name;
    // Address of customer
    private String address;
    // City of customer
    private String city;
    // ZIP code of customer
    private String zip;

    /**
     * Default constructor
     */
    public Customer() {
    }

    /**
     * Parameterized constructor
     * 
     * @param name    Name of customer
     * @param address Address of customer
     * @param city    City of customer
     * @param zip     ZIP code of customer
     */
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    /**
     * Accessor for Name
     * 
     * @return Name of customer
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for Address
     * 
     * @return Address of customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * Accessor for City
     * 
     * @return City of customer
     */
    public String getCity() {
        return city;
    }

    /**
     * Accessor for Zip
     * 
     * @return ZIP code of customer
     */
    public String getZip() {
        return zip;
    }

    /**
     * Override of toString()
     * 
     * @return Summary of customer object
     */
    public String toString() {
        return String.format("Name: %s\r\n" +
                "Address: %s\r\n" +
                "Name: %s\r\n" +
                "Zip: %s\r\n",
                name, address, city, zip);
    }
}
