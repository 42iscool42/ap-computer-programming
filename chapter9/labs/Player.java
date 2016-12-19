// *********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************
import java.util.Scanner;
public class Player {
    public String name;
    public String team;
    public int jerseyNumber;
    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and
    // jersey number.
    //-----------------------------------------------------------
    public void readPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System. out. print ("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }
    
    public boolean equals(Player p) {
        return name.equals(p.name) && team.equals(p.team) && jerseyNumber == p.jerseyNumber;
    }
}