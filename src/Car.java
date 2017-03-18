
public class Car {
    String name;
    double power;
    int speed;

    Car(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    void turbo() {
        power = power * 1.1;
    }

    void increaseSpeed(int change) {
        speed = speed + change;
    }

    void decreaseSpeed(int change) {
        speed = speed - change;
    }

    void show() {
        System.out.println(name + " " + power + " " + speed + " ");
    }
}
