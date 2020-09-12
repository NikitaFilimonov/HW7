package ru.geekbrains.lessons;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }




    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
