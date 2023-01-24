package org.example;

public class Horse extends Animal implements Runable{
    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Игого";
    }

    @Override
    public int speedofRun() {
        return 60;
    }
}
