package main.ui;

import main.config.Configuration;
import main.logic.field.Board;
import main.logic.field.BoardService;
import main.ui.frame.SnakeJFrame;
import main.ui.panels.MainJPanel;

import java.awt.*;

public class GameField {

    private BoardService boardService = new BoardService();

    public GameField() {
        getReady();
    }

    private SnakeJFrame frame;
    private MainJPanel mainPanel;

    public void getReady() {
        boardService.setInitialCellsType();
        frame = new SnakeJFrame();
        mainPanel = new MainJPanel();
        mainPanel.setPreferredSize(new Dimension(Configuration.boardWidth * Configuration.iconSize, Configuration.boardHeight * Configuration.iconSize));
        frame.add(mainPanel);
        frame.pack();
    }

}
