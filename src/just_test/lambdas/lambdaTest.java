package test.lambdas;

public class lambdaTest {
    public static void main(String[] args) {
        Rideble rideble = new Rideble() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };

        Car car = rideble.getCar("name");
    }
}
interface Rideble{
    Car getCar(String name);
}
class Car{
    String name;
    public Car(String name){
        this.name = name;
    }
}
