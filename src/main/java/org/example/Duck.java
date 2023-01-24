package org.example;

public class Duck extends Animal implements Flyable, Runable, Swimable{


    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Кря";
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedofRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 15;
    }
}
