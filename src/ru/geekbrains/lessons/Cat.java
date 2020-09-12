package ru.geekbrains.lessons;

public class Cat {
    private String name;
    private int appetite;
    private int hungry;
    private boolean isHungry;


    public Cat(String name, int appetite, int hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }



    public String getName() {
        return name;
    }
}
