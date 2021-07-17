package models;

public class ManagementGame {
        
    private Hero hero;
    public static final int MAP_SIZE_X = 800;
    public static final int MAP_SIZE_Y = 600;
    public static final int HERO_INIT_POSITION_X = 400;
    public static final int HERO_INIT_POSITION_Y = 520;

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
        return (IHero) hero;
    }
}
