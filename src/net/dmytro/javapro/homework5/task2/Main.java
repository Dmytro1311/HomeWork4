package net.dmytro.javapro.homework5.task2;

import net.dmytro.javapro.homework5.task2.obstacle.Course;
import net.dmytro.javapro.homework5.task2.obstacle.Cross;
import net.dmytro.javapro.homework5.task2.obstacle.Obstacle;
import net.dmytro.javapro.homework5.task2.obstacle.Wall;
import net.dmytro.javapro.homework5.task2.participant.liveparticipants.Cat;
import net.dmytro.javapro.homework5.task2.participant.liveparticipants.Human;
import net.dmytro.javapro.homework5.task2.participant.Robot;
import net.dmytro.javapro.homework5.task2.participant.liveparticipants.LiveParticipants;

public class Main {
    public static void main(String[] args){

        Course course = new Course(
                new Obstacle[] {
            new Cross(35,"Racetrack"),
            new Wall(3, "Wall")
        });

        Team team = new Team("FirstTeam",
                new Cat("Meovka", 10, 5),
                new Human("Harry", 10,2),
                new Robot("PX-one", 30, 5));
        team.getTeamInfo();
        course.doIt(team);
        team.showResults();


    }

}
