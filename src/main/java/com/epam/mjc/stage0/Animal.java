package com.epam.mjc.stage0;

public class Animal {

    public String color;
    public int numberOfPaws;
    public boolean hasFur;

    public Animal(){}

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur; }

        public  void getDescription () {
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

            System.out.println(result);
    }
    }