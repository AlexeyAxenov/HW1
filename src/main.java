import options.*;
import obstances.*;

public class main {

    public static void main(String[] args) {
        Team team1 = new Team("team1");
        team1.printInformationAboutTheTeam();
        Team team2 = new Team("team2");
        team2.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}