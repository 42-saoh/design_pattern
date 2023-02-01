package decorator;

public class Latte extends CoffeeDecorator {
    public Latte(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding milk");
    }
}
