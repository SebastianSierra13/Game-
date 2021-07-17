package view;

import models.IHero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public static final String TITLE = "Game";
    private PanelGame pnlGame;

    public MainWindow(int mapSizeX, int mapSizeY, KeyListener event) {
        setLayout(new BorderLayout());
        setSize(mapSizeX,mapSizeY);
        setTitle(TITLE);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon.png"))).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pnlGame = new PanelGame(event);
        add(pnlGame,BorderLayout.CENTER);

        setVisible(true);
        pnlGame.init();
    }

    public void refreshPanel(IHero heroData) {
        pnlGame.paintHero(heroData);
    }
}
