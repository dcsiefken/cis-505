/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Composer App\r\n");
        String option;
        Scanner scanner = new Scanner(System.in);
        MemComposerDao dao = new MemComposerDao();
        do {
            System.out.print("MENU OPTIONS\r\n" +
                    "  1. View Composers\r\n" +
                    "  2. Find Composer\r\n" +
                    "  3. Add Composer\r\n" +
                    "  4. Exit\r\n\r\n" +
                    "Please choose an option: ");
            option = scanner.nextLine();
            System.out.println();
            switch (option) {
                case "1":
                    System.out.println("--DISPLAYING COMPOSERS--");
                    List<Composer> allComposers = dao.findAll();
                    for (Composer composer : allComposers) {
                        System.out.println(composer);
                    }
                    break;
                case "2":
                    System.out.print("Enter an id: ");
                    int findId = Integer.parseInt(scanner.nextLine());
                    System.out.println("\r\n--DISPLAYING COMPOSER--");
                    Composer foundComposer = dao.findBy(findId);
                    if (foundComposer != null) {
                        System.out.println(foundComposer);
                    } else {
                        System.out.println("Composer not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter an id: ");
                    int newId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter a name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter a genre: ");
                    String newGenre = scanner.nextLine();
                    dao.insert(new Composer(newId, newName, newGenre));
                    break;
                case "4":
                    // do nothing. exit momentarily.
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (!option.equals("4"));
        scanner.close();
    }
}
