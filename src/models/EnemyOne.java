package models;

public class EnemyOne extends Enemy {

    private int x, y;

    public EnemyOne(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public void moveEnemyHorizontal() {
        int[][] level = getWorld().levelOne();
        int aux = getMoveSize();
        if (level[y/getSIZE()][x/getSIZE()] != 0) {
            aux *= -1;
        }
        x = x - aux;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
