package models;

public class ManagementGame {
        
    private final Hero hero;
    public static final int MAP_SIZE_X = 1366;
    public static final int MAP_SIZE_Y = 768;
    public static final int HERO_INIT_POSITION_X = 69;
    public static final int HERO_INIT_POSITION_Y = 45;

    public ManagementGame() {
        hero = new Hero(HERO_INIT_POSITION_X,HERO_INIT_POSITION_Y);
    }
    
    public void moveLeft(){
        hero.moveLeft();
    }

    public void moveRight(){
        hero.moveRight();
    }

    public void moveUp(){
        hero.moveUp();
    }

    public void moveDown(){
        hero.moveDown();
    }

    public IHero getHeroData(){
        return hero;
    }
}
