package factory;

public class CarFactory implements Factory {
    @Override
    public Car produceCar(String carName) {
        if (carName.equalsIgnoreCase(Car.SONATA)) {
            return new Sonata();
        }
        else if (carName.equalsIgnoreCase(Car.GRANDEUR)) {
            return new Grandeur();
        }
        else if (carName.equalsIgnoreCase(Car.GENESIS)) {
            return new Genesis();
        }
        else {
            return new Car();
        }
    }
}
