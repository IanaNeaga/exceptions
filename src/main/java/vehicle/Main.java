package vehicle;

public class Main {
    public static void main(String[] args) {
        Car car=new Car(100);

        try {
            car.accelerate(200);
        } catch (CarCrashedException e) {
            e.printStackTrace();
        }
    }
}
