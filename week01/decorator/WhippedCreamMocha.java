package decorator;

public class WhippedCreamMocha extends CoffeeDecorator {
    public WhippedCreamMocha(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding WhippedCream");
    }
}
