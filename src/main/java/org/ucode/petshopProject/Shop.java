package org.ucode.petshopProject;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to pur PetShop");

        String input = sc.next();

        if (input.equals("1")){
            System.out.println("What kind of animal would you like to add?");
            String type = sc.next();
            if (type.equals("cat")){
                System.out.println("Please input the following info for the cat: name, sex, color, age, weight," +
                        " number of legs, breed, running speed and if it is an indoor cat(true or false).");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Cat cat = new Cat(Boolean.parseBoolean(characteristics[8]));
                cat.setName(characteristics[0]);
                cat.setSex(characteristics[1]);
                cat.setColor(characteristics[2]);
                cat.setAge(Integer.parseInt(characteristics[3]));
                cat.setWeight(Integer.parseInt(characteristics[4]));
                cat.setNumOfLegs(Integer.parseInt(characteristics[5]));
                cat.setBreed(characteristics[6]);
                cat.setRunningSpeed(Integer.parseInt(characteristics[7]));

            }
            else if (type.equals("dog")){
                System.out.println("Please input the following info for the dog: name, sex, color, age, weight," +
                        " number of legs, breed, running speed and its size(small, medium or large).");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Dog dog = new Dog(characteristics[8]);
                dog.setName(characteristics[0]);
                dog.setSex(characteristics[1]);
                dog.setColor(characteristics[2]);
                dog.setAge(Integer.parseInt(characteristics[3]));
                dog.setWeight(Integer.parseInt(characteristics[4]));
                dog.setNumOfLegs(Integer.parseInt(characteristics[5]));
                dog.setBreed(characteristics[6]);
                dog.setRunningSpeed(Integer.parseInt(characteristics[7]));

            }
            else if (type.equals("bird")){
                System.out.println("Please input the following info for the bird: name, sex, color, age, weight," +
                        " type, if it can talk(true or false) and if it can fly(true or false).");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Bird bird = new Bird(characteristics[5], Boolean.parseBoolean(characteristics[6]), Boolean.parseBoolean(characteristics[7]));
                bird.setName(characteristics[0]);
                bird.setSex(characteristics[1]);
                bird.setColor(characteristics[2]);
                bird.setAge(Integer.parseInt(characteristics[3]));
                bird.setWeight(Integer.parseInt(characteristics[4]));

            }
            else if (type.equals("reptile")){
                System.out.println("Please input the following info for the reptile: name, sex, color, age, weight," +
                        " if it is cold blooded(true or false), type and what kind of crawling style it has.");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Reptile reptile = new Reptile(Boolean.parseBoolean(characteristics[6]),characteristics[7],characteristics[8]);
                reptile.setName(characteristics[0]);
                reptile.setSex(characteristics[1]);
                reptile.setColor(characteristics[2]);
                reptile.setAge(Integer.parseInt(characteristics[3]));
                reptile.setWeight(Integer.parseInt(characteristics[4]));

            }
            else if (type.equals("fish")){
                System.out.println("Please input the following info for the fish: name, sex, color, age, weight," +
                        " swimming style, if it is an exotic fish(true or false) and type.");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Fish fish = new Fish(characteristics[6],Boolean.parseBoolean(characteristics[7]),characteristics[8]);
                fish.setName(characteristics[0]);
                fish.setSex(characteristics[1]);
                fish.setColor(characteristics[2]);
                fish.setAge(Integer.parseInt(characteristics[3]));
                fish.setWeight(Integer.parseInt(characteristics[4]));

            }
            else if (type.equals("rabbit")){
                System.out.println("Please input the following info for the rabbit: name, sex, color, age, weight," +
                        " swimming style, if it is an exotic fish(true or false) and type.");
                System.out.println("Use commas when separating the input");
                String info = sc.next();
                String[] characteristics = info.split(",");
                Rabbit rabbit = new Rabbit(Boolean.parseBoolean(characteristics[5]));
                rabbit.setName(characteristics[0]);
                rabbit.setSex(characteristics[1]);
                rabbit.setColor(characteristics[2]);
                rabbit.setAge(Integer.parseInt(characteristics[3]));
                rabbit.setWeight(Integer.parseInt(characteristics[4]));

            }
            else {
                System.out.println("Please add a valid animal type");
                type = sc.next();
            }
        }

    }
}
