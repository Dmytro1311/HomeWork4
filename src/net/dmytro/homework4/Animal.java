package net.dmytro.homework4;

public abstract class Animal {
  protected int swimLength;
  protected int ranLength;

  /*  public Animal(int swimLength, int ranLength) {
        this.swimLength = swimLength;
        this.ranLength = ranLength;
    } */
    abstract void ran(int runLength);
    abstract void swim(int swimLength);
}
