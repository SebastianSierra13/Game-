package presenter;

import models.Levels;
import models.ManagementGame;
import view.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Presenter implements ActionListener , KeyListener {

    private final ManagementGame mngGame;
    private final MainWindow window;

    public Presenter() {
        Levels level = new Levels();
        mngGame = new ManagementGame();
        window = new MainWindow(level.levelOne(),this);
        window.refreshPanel(mngGame.getHeroData());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT, KeyEvent.VK_A -> mngGame.moveLeft();
            case KeyEvent.VK_RIGHT, KeyEvent.VK_D -> mngGame.moveRight();
            case KeyEvent.VK_UP, KeyEvent.VK_W -> mngGame.moveUp();
            case KeyEvent.VK_DOWN, KeyEvent.VK_S -> mngGame.moveDown();
        }
        window.refreshPanel(mngGame.getHeroData());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
