package templatemethod;

public abstract class Car {

    protected final void startCar() {
        System.out.println("시동을 켭니다.");
    }

    protected void drive() {}

    protected void stop() {}
    protected final void turnOff () {
        System.out.println("시동을 끕니다.");
    }

    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}