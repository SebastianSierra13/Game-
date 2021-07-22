package models;

public class EnemyTwo extends Enemy{

    private int x,y;

    public EnemyTwo(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public void moveEnemyVertical(){
        int[][] level = getWorld().levelOne();
        int aux = getMoveSize();
        if ((level[y / getSIZE()][x / getSIZE()]) != 0) {
            aux *= -1;
        }
        y += aux;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
