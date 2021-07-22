package models;

public class Hero {

    public static final int MOVE_SIZE = 3;
    public static final int SIZE = 23;
    public static final int X = 23;
    public static final int Y = 23;
    //public static final String IMG_PATH = "";*/
    private int x;
    private int y;
    private final World world;

    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
        world = new World();
    }

    public void moveLeft() {
        int[][] level = world.levelOne();
        if (level[y / Y][x / X] != 0) {
            x -= MOVE_SIZE;
        }


    }

    public void moveRight() {
        int[][] level1 = world.levelOne();
        if (level1[y / Y][x / X + 1] != 0) {
            x += MOVE_SIZE;
        }
    }

    public void moveUp() {
        int[][] level1 = world.levelOne();
        if (level1[y / Y][x / X] != 0) {
            y -= MOVE_SIZE;
        }
    }

    public void moveDown() {
        int[][] level1 = world.levelOne();
        if (level1[y / Y + 1][x / X] != 0) {
            y += MOVE_SIZE;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
