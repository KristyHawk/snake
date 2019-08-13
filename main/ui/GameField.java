package main.ui;

import main.ui.frame.SnakeJFrame;
import main.ui.panels.MainJPanel;

public class GameField {

    public GameField() {
        getReady();
    }

    private SnakeJFrame frame;
    private MainJPanel mainPanel;

    public void getReady() {
        frame = new SnakeJFrame();
        mainPanel = new MainJPanel();
    }

}
