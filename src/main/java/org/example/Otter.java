package org.example;

public class Otter extends Animal implements Swimable{

    public Otter(String name, int box) {
        super(name, box);

    }

    @Override
    public String say() {
        return "Кррр";
    }

    @Override
    public int speedOfSwim() {
        return 25;
    }
}
