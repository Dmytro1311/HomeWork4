package net.dmytro.javapro.homework5.task2.obstacle;

import net.dmytro.javapro.homework5.task2.participant.Participant;

public class Cross extends Obstacle {
    private int length;
    private String obstacleName;

    public Cross(int length,String obstacleName) {
        this.length = length;
        this.obstacleName = obstacleName;
    }

    @Override
    public boolean doIt(Participant participant) {
       if (!participant.ran(length)){
           return false;
       }else {
           return true;
       }




    }
}
