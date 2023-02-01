package observer;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println(new StringBuilder().append("*".repeat(Math.max(0, generator.getNumber()))).toString());
    }
}
