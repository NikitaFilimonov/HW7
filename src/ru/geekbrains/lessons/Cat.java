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

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public int getHungry() {
        return hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    private boolean isHungry(boolean isHungry) {
        if ((hungry - appetite) > 0) {
            return true;
        }
        return false;
    }

    public boolean isHungry() {
        return isHungry;
    }


    public String getName() {
        return name;
    }
}
