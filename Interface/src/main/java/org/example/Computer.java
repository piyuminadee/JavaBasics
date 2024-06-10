package org.example;

public interface Computer {

    public default void havemorePorts(){
        System.out.println("Dekstop have more ports");
    }
    public default void code(){
        System.out.println("Coding fast");
    }

    public default void haveBattery(){
        System.out.println("Laptop has battery");
    }
}
