package models;

public interface IGame {

    int getHeroPositionX();
    int getHeroPositionY();

    EnemyOne [] getEnemiesOne();
    EnemyTwo [] getEnemiesTwo();
}
