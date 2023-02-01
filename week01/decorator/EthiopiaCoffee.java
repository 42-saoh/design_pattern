package decorator;

public class EthiopiaCoffee implements Coffee {
    public String name;

    public EthiopiaCoffee() {
        this.name = ETHIOPIA + AMERICANO;
    }

    @Override
    public void assemble() {
        System.out.print(this.name);
    }
}
