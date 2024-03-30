/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

/**
 * Bag class - represents a subclass of Product for bowling bags
 */
public class Bag extends Product {
    // Bag type - how many balls can it fit?
    private String type;

    // Default constructor for Bag
    public Bag() {
        type = "";
    }

    /**
     * Getter for type
     * 
     * @return the type of this bag
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for type
     * 
     * @param type sets the type for this bag
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Override of Product.toString() that adds bag-specific field(s)
     */
    @Override
    public String toString() {
        return super.toString() +
                "Type: " + type + "\r\n";
    }
}
