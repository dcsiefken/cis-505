/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.List;
import java.util.Scanner;

/**
 * Tests the Composer and MemComposerDao classes
 */
public class TestComposerApp {
    public static void main(String[] args) {
        // welcome the user
        System.out.println("Welcome to the Composer App\r\n");
        String option;
        // set up the input device
        Scanner scanner = new Scanner(System.in);
        // initialize a new MemComposerDao for managing the list of composers
        MemComposerDao dao = new MemComposerDao();
        // loop until exit is chosen
        do {
            // display the menu, prompt for option
            System.out.print("MENU OPTIONS\r\n" +
                    "  1. View Composers\r\n" +
                    "  2. Find Composer\r\n" +
                    "  3. Add Composer\r\n" +
                    "  4. Exit\r\n\r\n" +
                    "Please choose an option: ");
            option = scanner.nextLine();
            System.out.println();

            // execute the chosen option
            switch (option) {
                case "1":
                    System.out.println("--DISPLAYING COMPOSERS--");
                    // for each composer in whole list, print friendly description
                    List<Composer> allComposers = dao.findAll();
                    for (Composer composer : allComposers) {
                        System.out.println(composer);
                    }
                    break;
                case "2":
                    // prompt for an id
                    System.out.print("Enter an id: ");
                    int findId = Integer.parseInt(scanner.nextLine());
                    System.out.println("\r\n--DISPLAYING COMPOSER--");
                    // print out the friendly description of that composer, if they exist.
                    // otherwise print a message about not finding them.
                    Composer foundComposer = dao.findBy(findId);
                    if (foundComposer != null) {
                        System.out.println(foundComposer);
                    } else {
                        System.out.println("Composer not found.");
                    }
                    break;
                case "3":
                    // prompt for id, name, genre values
                    System.out.print("Enter an id: ");
                    int newId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter a name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter a genre: ");
                    String newGenre = scanner.nextLine();
                    // insert a new composer with those values
                    dao.insert(new Composer(newId, newName, newGenre));
                    break;
                case "4":
                    // do nothing. exit momentarily.
                    break;
                default:
                    // print an error message if invalid input provided
                    System.out.println("Invalid option.");
                    break;
            }
        } while (!option.equals("4"));
        // close the input device
        scanner.close();
    }
}
