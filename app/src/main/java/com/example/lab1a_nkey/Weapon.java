package com.example.lab1a_nkey;

import java.util.Random;

public enum Weapon {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");
    private String message;

    private Weapon(String msg) { message = msg; }

    public static Weapon getRandomWeapon(){
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }

    @Override
    public String toString() { return message; }

};
