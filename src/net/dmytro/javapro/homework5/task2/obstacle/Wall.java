package net.dmytro.javapro.homework5.task2.obstacle;

import net.dmytro.javapro.homework5.task2.participant.Participant;

public  class Wall extends Obstacle {
    private int height;
    private String obstacleName;

    public Wall(int height, String obstacleName) {
        this.height = height;
        this.obstacleName = obstacleName;
    }

    @Override
    public boolean doIt(Participant participant){
       return participant.jump(height);

    }


}
