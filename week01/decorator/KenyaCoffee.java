package decorator;

public class KenyaCoffee implements Coffee {
    public String name;

    public KenyaCoffee() {
        this.name = KENYA + AMERICANO;
    }

    @Override
    public void assemble() {
        System.out.print(this.name);
    }
}
