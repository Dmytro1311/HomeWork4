package net.dmytro.javapro.homework5.task2.participant;

public class Robot implements Participant {
    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;


    public Robot(String name,int maxRunDistance, int maxJumpHeight) {
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
    public void jump(int height) {
        if(height <= maxJumpHeight){
            System.out.println("Participent " + name + " passed the obstacle " + "Wall " + height + " m");
        }else {
            System.out.println("Participent "+  name + " didn't pass the obstacle" + "Wall " + height + " m");
            onDistance = false;
        }

    }

    @Override
    public void ran(int length) {
        if(length <= maxRunDistance){
            System.out.println("Participent " + name + " successfully ran distance " + length + " m");
        }else {
            System.out.println("Participent " + name + " couldn't run distance " + length + " m");
            onDistance = false;
        }

    }

    @Override
    public String getName() {
        return this.name;
    }


    public String toString() {
        return name + " : " + (onDistance() ? "at distance" : "left the distance");
    }
}
