/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by A. Student 2021
    Additional modifications by Clay Siefken 2024
*/ 
public class SiefkenHelloWorld {

    /**
     * Method with two arguments, which are used to print the user's first and last name with a greeting message.
     * @param firstName String 
     * @param lastName String
     * @return prints the results to the console window.
     */
    public static void helloWorld(String firstName, String lastName) {
        System.out.printf("Hello World from %s %s\r\n", firstName, lastName);
    } // end helloWorld

    public static void main(String[] args) {
        helloWorld("Clay", "Siefken"); // Call the helloWorld() method with the values "Clay" and "Siefken."
    } // end main
} // end SiefkenHelloWorld