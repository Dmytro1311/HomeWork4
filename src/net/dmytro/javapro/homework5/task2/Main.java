package net.dmytro.javapro.homework5.task2;


import net.dmytro.javapro.homework5.task2.obstacle.Cross;
import net.dmytro.javapro.homework5.task2.obstacle.Obstacle;
import net.dmytro.javapro.homework5.task2.obstacle.Wall;
import net.dmytro.javapro.homework5.task2.participant.Cat;
import net.dmytro.javapro.homework5.task2.participant.Human;
import net.dmytro.javapro.homework5.task2.participant.Robot;

public class Main {
    public static void main(String[] args){
        Obstacle[] obstacles =new Obstacle[]{
                        new Cross(3, "Racetrack"),
                        new Wall(3, "Wall")
                };


        Team team = new Team("FirstTeam",
                new Cat("Meovka", 4, 2),
                new Human("Harry", 10,3),
                new Robot("PX-one", 10, 5));

        team.getTeamInfo();
        team.doIt(obstacles);
        team.showResults();


    }

}
