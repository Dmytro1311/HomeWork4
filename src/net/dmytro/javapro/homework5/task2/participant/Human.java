package net.dmytro.javapro.homework5.task2.participant;

import net.dmytro.javapro.homework5.task2.participant.Participant;

public class Human implements Participant {
    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;


    public Human(String name,int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;

    }
    @Override
    public boolean onDistance() {
        return onDistance;
    }

    @Override
    public boolean jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println("Participent " + name + " passed the obstacle " + "Wall " + height + " m");
            return true;
        }else {
            System.out.println("Participent "+  name + " didn't pass the obstacle" + "Wall " + height + " m");
            return false;
        }

    }

    @Override
    public boolean ran(int length) {
        if(length <= maxRunDistance){

            System.out.println("Participent " + name + " successfully ran distance " + length + " m");
            return true;
        }
            System.out.println("Participent " + name + " couldn't run distance " + length + " m");
            return false;


    }

    @Override
    public String getName() {
        return "Human " + name;
    }


    public String toString() {
        return name + " : " + (onDistance() ? "at distance" : "left the distance");
    }
}
