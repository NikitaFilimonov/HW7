package ru.geekbrains.lessons;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    boolean isPlateEmpty(int n) {
        return (food - n) >= 0;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;

    }

    public void increaseFood(int n) {
        this.food += n;
        System.out.println("Было добавлено " + n + " еды");

    }



    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
