/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/
package Module_1.FanApp;

public class Fan {

    /* constants */

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /* private data fields */

    private int speed;
    private boolean isOn;
    private double radius;
    private String color;

    /**
     * Accessor method for the fan's current speed
     * 
     * @return current speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Mutator for the fan's current speed
     * 
     * @param speed the fan's new current speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Accessor for the fan's current on/off state
     * 
     * @return true for on, false for off
     */
    public boolean getIsOn() {
        return isOn;
    }

    /**
     * Mutator for the fan's current on/off state
     * 
     * @param isOn the new current on/off state
     */
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * Accessor for the fan's current radius
     * 
     * @return the fan's current radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutator for the fan's current radius
     * 
     * @param radius the fan's new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Accessor for the fan's current color
     * 
     * @return the fan's current color
     */
    public String getColor() {
        return color;
    }

    /**
     * Mutator for the fan's current color
     * 
     * @param color the fan's new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Default constructor for Fan
     * - Sets speed to STOPPED
     * - Sets isOn to false
     * - Sets radius to 6
     * - Sets color to "white"
     */
    public Fan() {
        this.speed = Fan.STOPPED;
        this.isOn = false;
        this.radius = 6;
        this.color = "white";
    }

    /**
     * Constructor for Fan with configurable parameters
     * 
     * @param speed  sets speed
     * @param isOn   sets isOn
     * @param radius sets radius
     * @param color  sets color
     */
    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Override of toString()
     * 
     * @return a description for the fan
     */
    public String toString() {
        /*
         * If the fan is on, the method returns the fan speed, color, and radius
         * in a combined string.
         */
        if (this.isOn) {
            return String.format("The fan speed is set to %d with a color of %s and a radius of %.1f", this.speed,
                    this.color, this.radius);
        }
        /*
         * If the fan is not on, the method returns the fan color, radius, and a
         * message of “fan is off” in a combined string.
         */
        return String.format("The fan is %s with a radius of %.1f and the fan is off", this.color, this.radius);
    }

} // end Fan