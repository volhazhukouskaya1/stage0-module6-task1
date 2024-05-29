package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(){}

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur; }

        public String getDescription () {
            String s;
            if (hasFur) {
                s = " a ";
            } else {
                s = " no ";
            }
            String result;
            if (numberOfPaws>1) {
                result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and" + s + "fur.";
            }
            else {
                result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and" + s + "fur.";

            }

          return result;
    }
    }