package decorator;

public class Mocha extends CoffeeDecorator {
    public Mocha(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding Mocha Syrup");
    }
}
