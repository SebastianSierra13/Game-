package models;

public class Hero implements IHero {

    public static final int MOVE_SIZE = 3;
    public static final int SIZE = 23;
    public static final int X = 23;
    public static final int Y = 23;
    //public static final String IMG_PATH = "";*/
    private int x;
    private int y;
    private final Levels levels;

    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
        levels = new Levels();
    }

    public void moveLeft() {
        int[][] level1 = levels.levelOne();
        if (level1[y / Y][x / X] != 0) {
            x -= MOVE_SIZE;
        }


    }

    public void moveRight() {
        int[][] level1 = levels.levelOne();
        if (level1[y / Y][x / X + 1] != 0) {
            x += MOVE_SIZE;
        }


    }

    public void moveUp() {
        int[][] level1 = levels.levelOne();


        if (level1[y / Y][x / X] != 0) {
            y -= MOVE_SIZE;

        }
    }

    public void moveDown() {
        int[][] level1 = levels.levelOne();
        if (level1[y / Y + 1][x / X] != 0) {
            y += MOVE_SIZE;
        }
    }

    @Override
    public int getHeroPositionX() {
        return x;
    }

    @Override
    public int getHeroPositionY() {
        return y;
    }
}
