/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

/**
 * Ball class - represents a subclass of Product for bowling balls
 */
public class Ball extends Product {
    // the color of this ball
    private String color;

    // Default constructor for Ball
    public Ball() {
        color = "";
    }

    /**
     * getter for color
     * 
     * @return color of this Ball
     */
    public String getColor() {
        return color;
    }

    /**
     * setter for color
     * 
     * @param color the new color for this Ball
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * override of Product.toString() that adds Ball-specific field(s)
     */
    @Override
    public String toString() {
        return super.toString() +
                "Color: " + color + "\r\n";
    }
}
