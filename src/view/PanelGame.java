package view;

import models.Hero;
import models.IHero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class PanelGame extends JPanel {
    private IHero heroData;
    public BufferedImage background;

    public PanelGame(KeyListener event) {
        addKeyListener(event);
    }

    public void init() {
        background = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        requestFocusInWindow();
    }

    public void paintHero(IHero heroData){
        this.heroData = heroData;
        Graphics g = background.createGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.heroData.getHeroPositionX(), this.heroData.getHeroPositionY(), Hero.SIZE,Hero.SIZE);
        repaint();
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
