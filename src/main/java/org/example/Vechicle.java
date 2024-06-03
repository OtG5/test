package org.example;

public interface Vechicle {
    public String licensePlate = "";
    public float maxVel = 7;
    public void start();
    public void stop();
    default void blowHorn(){
        System.out.println("Blowing horn");
    }
}
