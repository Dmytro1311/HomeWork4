package net.dmytro.javapro.homework5.task2.obstacle;

import net.dmytro.javapro.homework5.task2.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for(Obstacle obstacle: obstacles){
            team.doIt(obstacle);
        }
    }
}
