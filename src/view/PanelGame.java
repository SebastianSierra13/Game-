package view;

import models.Hero;
import models.IHero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class PanelGame extends JPanel {
    public static final int NUMBER_ROWS = 31;
    public static final int NUMBER_COLUMNS = 60;
    public static final int RECT_SIZE = 23;
    private final int [][] levelOne;
    private BufferedImage background;

    //private Image backgroundWorld;
    public PanelGame(KeyListener event,int [][] levelOne) {
        this.levelOne = levelOne;
        //backgroundWorld = new ImageIcon(getClass().getResource("/images/world.png")).getImage();
        addKeyListener(event);
    }

    public void init() {
        background = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        requestFocusInWindow();
    }

    public void updateGame(IHero heroData){
        Graphics g = background.createGraphics();
        paintWorld(g);
        paintHero(heroData,g);
        repaint();
    }

    private void paintHero(IHero heroData, Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(heroData.getHeroPositionX(), heroData.getHeroPositionY(), Hero.SIZE,Hero.SIZE);
    }

    private void paintWorld(Graphics g) {
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                if (levelOne[i][j]!=0){
                    g.setColor(Color.BLUE);
                    g.fillRect(j * Hero.SIZE,i * Hero.SIZE, RECT_SIZE,RECT_SIZE);
                   // g.drawImage(backgroundWorld,getWidth(),getHeight(),this);
                }
            }
        }
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        g2.drawImage(background,0,0,this);
    }

}
