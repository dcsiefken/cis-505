/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_2.SportsTeamApp;

/* 
 * Represents a sports team
 */
public class Team {
    private String teamName;
    private String[] players;
    private int playerCount;

    public Team(String teamName) {
        players = new String[20];
        this.teamName = teamName;
    }

    public void addPlayer(String player) {
        players[playerCount++] = player;
    }

    public String[] getPlayers() {
        return players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public String getTeamName() {
        return teamName;
    }

}
