import java.util.concurrent.CopyOnWriteArraySet;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.color = "Red";

        Car car2 = new Car();
        car2.speed = 150;
        car2.color = "Blue";

        System.out.println("Car1 colour and speed:" +car1.color+"        "+car1.speed);
        System.out.println("Car2 colour and speed:" +car2.color+"       "+car2.speed);


    }
}
