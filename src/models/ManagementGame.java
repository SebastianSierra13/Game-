package models;

import java.util.ArrayList;

public class ManagementGame extends MyThread implements IGame {

    public static final int MAP_SIZE_X = 1366;
    public static final int MAP_SIZE_Y = 768;
    public static final int HERO_INIT_POSITION_X = 69;
    public static final int HERO_INIT_POSITION_Y = 46;
    public static final int NUMBER_ROWS = 31;
    public static final int NUMBER_COLUMNS = 60;
    public static final int MAX_ENEMIES = 10;
    private final ArrayList<EnemyOne> enemies1;
    private final ArrayList<EnemyTwo> enemies2;
    private final World world;
    private final Hero hero;

    public ManagementGame() {
        hero = new Hero(HERO_INIT_POSITION_X, HERO_INIT_POSITION_Y);
        enemies1 = new ArrayList<>();
        enemies2 = new ArrayList<>();
        world = new World();
        sleepThread(5000);
        executeTask();
        start();
    }

    @Override
    public void executeTask() {
        if (enemies1.size() < MAX_ENEMIES && enemies2.size() < MAX_ENEMIES){
            createEnemiesOne();
            createEnemiesTwo();
        }
        for (EnemyOne enemy1 : enemies1) {
            enemy1.moveEnemyHorizontal();
        }
        for (EnemyTwo enemy2 : enemies2) {
            enemy2.moveEnemyVertical();
        }
        System.out.println("si se ejecuta");
    }

    public void moveLeft() {
        hero.moveLeft();
    }

    public void moveRight() {
        hero.moveRight();
    }

    public void moveUp() {
        hero.moveUp();
    }

    public void moveDown() {
        hero.moveDown();
    }


    public void createEnemiesOne() {
        int[][] worldArray = world.levelOne();
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                if (worldArray[i][j] == 3 ) {
                    enemies1.add(new EnemyOne(j ,i ));
                }
            }
        }

    }

    public void createEnemiesTwo() {
        int[][] worldArray = world.levelOne();
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                if ( worldArray[i][j] == 4) {
                    enemies2.add(new EnemyTwo(j ,i ));
                }
            }
        }

    }

    @Override
    public int getHeroPositionX() {
        return hero.getX();
    }

    @Override
    public int getHeroPositionY() {
        return hero.getY();
    }

    @Override
    public EnemyOne[] getEnemiesOne() {
        return enemies1.toArray(new EnemyOne[enemies1.size()]);
    }
    @Override
    public EnemyTwo[] getEnemiesTwo() {
        return enemies2.toArray(new EnemyTwo[enemies2.size()]);
    }
}
