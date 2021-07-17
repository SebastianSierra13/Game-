package view;

import models.IHero;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainWindow extends JFrame {

    public static final String TITLE = "Game";
    private PanelGame pnlGame;

    public MainWindow(IHero hero, int mapSizeX, int mapSizeY) {
        setLayout(new BorderLayout());
        setSize(mapSizeX,mapSizeY);
        setTitle(TITLE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon.png"))).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pnlGame = new PanelGame(hero);
        add(pnlGame,BorderLayout.CENTER);

        setVisible(true);
        pnlGame.init();
    }

}
