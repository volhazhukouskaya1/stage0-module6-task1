package com.epam.mjc.stage0;

public class Bird extends Animal {



    public Bird() {
        super("blue", 2,false);
    }


    public  String getDescription () {

            String a = super.getDescription();

            a= a+" Moreover, it has 2 wings and can fly.";

            return a;
        }
    }
