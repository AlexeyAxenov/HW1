package options;
import java.util.*;

public class Team {
    private String nameTeam = "squad1";
    characters[] squad1 = {new Alex("Ivanov"), new Viktor("Alekseev"), new Ivan("Intylov"), new George("Mayakan")};
    public characters[] characters = new characters[4];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(4);
            characters[i] = squad1[ran];
        }
    }
    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for(characters a : characters) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (characters a : characters){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}