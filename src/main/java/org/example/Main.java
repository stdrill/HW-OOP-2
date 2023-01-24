package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "grey"))
                .addAnimal(new Horse("Ignat", 10))
                .addAnimal(new Duck("Donald", 12))
                .addAnimal(new Otter("Perry", 4));

        for (Animal an: zoo1.getAnimals()){
            System.out.println(an);
            System.out.println(an.say());
        }
//        for (Speakable speak: zoo1.getSpeakables()){
//            System.out.println(speak.say());
//        }
        for (Runable runner: zoo1.getRunner()){
            System.out.println(runner.speedofRun());
        }
        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max speed is %d", max));

        System.out.println("- - - - -");
        for (Flyable flyer: zoo1.getFlyers()){
            System.out.println(flyer.speedOfFly());
        }

        System.out.println("- - - - - -");
        for (Swimable swimmer: zoo1.getSwimables()) {
            System.out.println(String.format(swimmer +" swims " + swimmer.speedOfSwim() + " km/h"));
        }

    }
}