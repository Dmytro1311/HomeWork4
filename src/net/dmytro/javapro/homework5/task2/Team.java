package net.dmytro.javapro.homework5.task2;

import net.dmytro.javapro.homework5.task2.obstacle.Obstacle;
import net.dmytro.javapro.homework5.task2.participant.liveparticipants.Cat;
import net.dmytro.javapro.homework5.task2.participant.liveparticipants.Human;
import net.dmytro.javapro.homework5.task2.participant.Participant;
import net.dmytro.javapro.homework5.task2.participant.Robot;

public class Team {
    private String name;
    private Participant participants[];

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Participant ... participantGiven) {
        this.name = name;
        this.participants = participantGiven;
    }
    public void getTeamInfo(){
        System.out.println("Team name " + this.name);
        for (Participant participant : participants){
            if (participant instanceof Cat){
                System.out.println("Cat " + participant.getName());
            }
            if (participant instanceof Human){
                System.out.println("Human " + participant.getName());
            }
            if (participant instanceof Robot){
                System.out.println("Robot " + participant.getName());
            }
        }
    }
    public void showResults(){
        for (Participant participant : participants){
            if (participant.onDistance()){
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants){
            obstacle.doIt(participant);
        }
    }

}
