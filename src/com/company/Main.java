package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here\

        Duck wildDuck = new WildDuck();
        wildDuck.flyLikeABird();
        ((WildDuck)wildDuck).testM();
    }
}
