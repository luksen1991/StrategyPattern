package com.company;

public class WildDuck extends Duck{

    public WildDuck(){
        flyInterface = new BirdFly();
    }

    public void testM(){
        System.out.println("test");
    }
}
