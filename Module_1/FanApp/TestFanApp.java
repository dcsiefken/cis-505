/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/
package Module_1.FanApp;

public class TestFanApp {

    /* Tests the Fan class. */
    public static void main(String[] args) {
        /*
         * Create two instances of the Fan class, one using the default
         * constructor and the other using the argument constructor.
         * For the second argument constructor, use the classes constants to
         * set the speed.
         */
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8, "Blue");

        /*
         * Display the objects by invoking the classes toString() method.
         */

        System.out.println(fan1);
        System.out.println(fan2);
    } // end main
} // end TestFanApp