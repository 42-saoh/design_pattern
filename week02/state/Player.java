package state;

public class Player {
    private PlayerLevel level;


    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(int level) {
        this.level = this.level.go(level);
        this.level.showLevelMessage();
    }

    public void play(int time) {
        level.run();
        for(int i = 0; i < time; i++) {
            level.jump();
        }
        level.turn();
    }
}
