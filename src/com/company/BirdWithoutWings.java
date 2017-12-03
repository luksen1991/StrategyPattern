package com.company;

public class BirdWithoutWings implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("Nie umiem latac bo nie mam skrzydel");
    }
}
