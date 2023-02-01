package factory;

public class Car {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    String productName;

    public Car() {
        this.productName = "noname";
    }
    public String toString() {
        return productName;
    }
}