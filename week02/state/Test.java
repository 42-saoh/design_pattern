package state;

public class Test {
    public static void main(String[] args) {
            Player player = new Player();
            player.play(1);
            player.upgradeLevel(PlayerLevel.ADVANCED_LEVEL);
            player.play(2);
            player.upgradeLevel(PlayerLevel.SUPER_LEVEL);
            player.play(3);
    }
}