package presenter;

import models.ManagementGame;
import view.MainWindow;

public class Presenter {

    private ManagementGame mngGame;
    private MainWindow window;

    public Presenter() {
        mngGame = new ManagementGame();
        window = new MainWindow(mngGame.getHeroData(), ManagementGame.MAP_SIZE_X, ManagementGame.MAP_SIZE_Y);
    }

}
