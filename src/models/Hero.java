package models;

public class Hero implements IHero{

    private int x;
    private int y;
    public static final int MOVE_SIZE = 5;
    public static final int SIZE = 40;
    public static final String IMG_PATH = "";

    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveLeft() {
        if (x - MOVE_SIZE > 0) {
            x -= MOVE_SIZE;
        }

    }

    public void moveRight() {
        if (x + MOVE_SIZE < ManagementGame.MAP_SIZE_X) {
            x += MOVE_SIZE;
        }

    }

    public void moveUp() {
        if (y - MOVE_SIZE > 0) {
            y += MOVE_SIZE;
        }
    }

    public void moveDown() {
        if (y + MOVE_SIZE < ManagementGame.MAP_SIZE_Y)
        y -= MOVE_SIZE;
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
