package net.dmytro.homework4;

public abstract class Animal {
  protected int maxSwimDistance;
  protected int maxRanDistance;
  protected int distanceToDo;
  private static int count;

  public Animal(){
    count++;
  }
  public static int getCount(){
    return count;
  }






    abstract void ran(int maxRanDistance, int distanceToDo);
    abstract void swim(int maxSwimDistance, int distanceToDo);

}
