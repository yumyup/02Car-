package model;

public class Car {
    private String name;
    private double power;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    public void turbo() {
        power = power * 1.1;
    }

    public void increaseSpeed(int change) {
        speed = speed + change;
    }

    public void decreaseSpeed(int change) {
        speed = speed - change;
    }

    public void show() {
        System.out.println(name + " " + power + " " + speed + " ");
    }
}
