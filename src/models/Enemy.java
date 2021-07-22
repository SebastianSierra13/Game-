package models;

public class Enemy {
    private final int x;
    private final int y;
    private final World world;
    public static final int SIZE = 23;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        world = new World();
    }

    public World getWorld() {
        return world;
    }

    public int getMoveSize() {
        return 2;
    }

    public static int getSIZE() {
        return SIZE;
    }
}
