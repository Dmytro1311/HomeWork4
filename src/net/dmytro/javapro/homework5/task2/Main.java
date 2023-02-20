package net.dmytro.javapro.homework5.task2;


import net.dmytro.javapro.homework5.task2.obstacle.Course;
import net.dmytro.javapro.homework5.task2.obstacle.Cross;
import net.dmytro.javapro.homework5.task2.obstacle.Obstacle;
import net.dmytro.javapro.homework5.task2.obstacle.Wall;
import net.dmytro.javapro.homework5.task2.participant.Cat;
import net.dmytro.javapro.homework5.task2.participant.Human;
import net.dmytro.javapro.homework5.task2.participant.Participant;
import net.dmytro.javapro.homework5.task2.participant.Robot;

public class Main {
    public static void main(String[] args){

                 Course course = new Course(
                new Obstacle[]{
                        new Cross(3, "Racetrack"),
                        new Wall(3, "Wall")
                });


        Team team = new Team("FirstTeam",
                new Cat("Meovka", 1, 5),
                new Human("Harry", 10,2),
                new Robot("PX-one", 30, 5));
        team.getTeamInfo();
        course.doIt(team);
        team.showResults();


    }

}
