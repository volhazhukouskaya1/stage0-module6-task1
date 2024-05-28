package com.epam.mjc.stage0;

public class Dog extends Animal  {

    public Dog() {
            super();
        }

        Dog dog = new Dog();

        {dog.color="brown";
            dog.numberOfPaws= 4;
            dog.hasFur=true;}

        public  void getDescription () {

            String a;
            if (dog.hasFur) {
                a = " a ";
            } else {
                a = " no ";
            }
            System.out.println("This animal is mostly " + dog.color + ". It has " + dog.numberOfPaws + " paws and" + a + "fur.");
        }
    }


