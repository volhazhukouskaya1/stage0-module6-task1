package com.epam.mjc.stage0;

public class Bird extends Animal {



    public Bird() {
        super();
    }

   Bird bird = new Bird();

    {bird.color="blue";
    bird.numberOfPaws= 2;
    bird.hasFur=false;}

    public  void getDescription () {

            String a;
            if (bird.hasFur) {
                a = " a ";
            } else {
                a = " no ";
            }
            String result;
            if (bird.numberOfPaws > 1) {
                result = "This animal is mostly " + bird.color + ". It has " + bird.numberOfPaws + " paws and" + a + "fur. Moreover, it has 2 wings and can fly.";
            } else {
                result = "This animal is mostly " + bird.color + ". It has " + bird.numberOfPaws + " paw and" + a + "fur. Moreover, it has 2 wings and can fly.";
            }
           System.out.println(result);
        }
    }
