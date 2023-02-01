package state;

public abstract class PlayerLevel {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    public final PlayerLevel go(int level) {
        switch (level) {
            case ADVANCED_LEVEL -> { return new AdvancedLevel(); }
            case SUPER_LEVEL -> { return new SuperLevel(); }
            default -> { return new BeginnerLevel(); }
        }
    }
}
