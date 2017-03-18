
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 170,80);
        car1.show();
        car1.turbo();
        car1.show();
        car1.increaseSpeed(20);
        car1.show();
        car1.decreaseSpeed(80);
        car1.show();
    }
}
