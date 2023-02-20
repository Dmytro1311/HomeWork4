package net.dmytro.javapro.homework5.task2;


import net.dmytro.javapro.homework5.task2.obstacle.Obstacle;
import net.dmytro.javapro.homework5.task2.participant.Participant;

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
                System.out.println(participant.getName());


        }
    }
    public void showResults(){
        for (Participant participant : participants){
            if (participant.onDistance()){
                break;
            }
        }
    }
    public void doIt(Obstacle obstacles){
        for (Participant participant : participants ){
            obstacles.doIt(participant);

        }


    }

}
