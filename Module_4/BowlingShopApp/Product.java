/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

/**
 * Product - base class for all bowling shop product types
 */
public class Product {
    // short code for tracking this type of product
    private String code;
    // long human-readable description of this product
    private String description;
    // how much a unit of this product costs
    private double price;

    // Default constructor for Product
    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    /**
     * Getter for code
     * 
     * @return the product code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for code
     * 
     * @param code the new code for this product
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for description
     * 
     * @return the current description for this product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for description
     * 
     * @param description the new description for this product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for price
     * 
     * @return current price for this product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for price
     * 
     * @param price new price for this product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Override of toString()
     * Returns a string representation of this product using base fields only
     */
    @Override
    public String toString() {
        return "Product code: " + code + "\r\n" +
                "Description: " + description + "\r\n" +
                "Price: " + String.format("$%,6.2f", price) + "\r\n";
    }
}
