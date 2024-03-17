/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Clay Siefken (2024) CIS 505 Intermediate Java Programming. 
        Bellevue Univ.
*/

package Module_2.SportsTeamApp;

import java.util.Scanner;

/*
 * Prompts user for input, outlines the team they've created, and optionally
 * loops again.
 */
public class TestSportsTeamApp {
    public static void main(String[] args) {
        // Set up Scanner object needed to read from input
        Scanner input = new Scanner(System.in);

        // Print a welcome message
        System.out.println("Welcome to the Sports Team App");
        System.out.println();

        do {
            // Gather input from user
            Team team = inputTeam(input);
            // Summarize the Team that was created
            outputTeam(team);
        } while (continueRunning(input)); // Run again if the user so desires

        // Close the scanner when done using it (best practice)
        input.close();
    }

    /**
     * Prompts the user for details needed to create a Team object
     * 
     * @param input Scanner object used for reading from standard input
     * @return fully-configured Team object based on user input
     */
    private static Team inputTeam(Scanner input) {
        // Get the team name
        System.out.print("Enter a team name: ");
        String teamName = input.nextLine();
        System.out.println();

        // Initialize the Team object to return
        Team team = new Team(teamName);

        // Get the player names as a single string
        System.out.println("Enter the player names:");
        System.out.print("  hint use commas for multiple players; no spaces>: ");
        String playerNames = input.nextLine();
        System.out.println();

        // Split the player names into an array
        String[] players = playerNames.split(",");

        // Add each player to the Team object
        for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
            team.addPlayer(players[playerIndex]);
        }

        // return the fully-configured Team object
        return team;
    }

    /**
     * Summarize the details of the provided Team object.
     * 
     * @param team Team object to summarize
     */
    private static void outputTeam(Team team) {
        // Print a summary header
        System.out.println("==Team Summary==");

        // Print number of players
        System.out.println("Number of players in team: " + team.getPlayerCount());

        // Print header for player line
        System.out.print("Players on team: ");
        // For each player
        for (int playerIndex = 0; playerIndex < team.getPlayerCount(); playerIndex++) {
            // Print the player's name
            System.out.print(team.getPlayers()[playerIndex]);
            // If this is not the last player, print a comma to separate names
            if (playerIndex + 1 < team.getPlayerCount()) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    /**
     * Return true if the user wants to continue, otherwise false
     * 
     * @param input Scanner object to read from
     * @return true or false
     */
    private static boolean continueRunning(Scanner input) {
        // Print a prompt for the user
        System.out.print("Continue? (y/n): ");

        // Read their response
        var yesOrNo = input.nextLine();
        System.out.println();

        // Return true or false based on response
        return yesOrNo.equals("y");
    }
}
