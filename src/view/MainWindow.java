package view;

import models.IGame;
import models.ManagementGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public static final String TITLE = "Game";
    private final PanelGame pnlGame;

    public MainWindow(int[][] levelOne, KeyListener event) {
        setLayout(new BorderLayout());
        setSize(ManagementGame.MAP_SIZE_X, ManagementGame.MAP_SIZE_Y);
        setTitle(TITLE);
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon.png"))).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pnlGame = new PanelGame(event, levelOne);
        add(pnlGame, BorderLayout.CENTER);
        setVisible(true);
        pnlGame.init();
    }

    public void updateGame(IGame gameData) {
        pnlGame.updateGame(gameData);
    }

}

