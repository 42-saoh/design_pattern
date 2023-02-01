package singleton;

public class Singleton {
    private Singleton(){}

    private static class InnerSingleton {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
