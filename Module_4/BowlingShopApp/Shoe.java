/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

/**
 * Shoe class - represents a subclass of Product for bowling shoes
 */
public class Shoe extends Product {
    // the size of the shoe
    private double size;

    /**
     * Default constructor for Shoe
     */
    public Shoe() {
        size = 0;
    }

    /**
     * Setter for size
     * 
     * @param size the new size of the shoe
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Getter for size
     * 
     * @return the current size of the shoe
     */
    public double getSize() {
        return size;
    }

    /**
     * override of Product.toString() that adds Shoe-specific field(s)
     */
    @Override
    public String toString() {
        return super.toString() +
                "Size: " + size + "\r\n";
    }
}
