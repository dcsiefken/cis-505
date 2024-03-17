/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_2.SportsTeamApp;

/* 
 * Represents a sports team
 */
public class Team {
    // Name of the team
    private String teamName;
    // Names of players on the team
    private String[] players;
    // How many players on the team
    private int playerCount;

    /**
     * Constructor for Team
     * 
     * @param teamName Name of the team
     */
    public Team(String teamName) {
        // initialize players to hold up to 20 names
        players = new String[20];
        // use value passed in for team name
        this.teamName = teamName;
    }

    /**
     * Mutator for players
     * 
     * @param player player to add
     */
    public void addPlayer(String player) {
        // add a player name to the end of the array and increment number of
        // players
        players[playerCount++] = player;
    }

    /**
     * Accessor for players
     * 
     * @return the array of all player names in the object
     */
    public String[] getPlayers() {
        return players;
    }

    /**
     * Accessor for player count
     * 
     * @return number of players
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Accessor for team name
     * 
     * @return the team's name
     */
    public String getTeamName() {
        return teamName;
    }

}
