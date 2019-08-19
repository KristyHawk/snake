package main.view;

import main.controller.BoardController;
import main.controller.services.BoardService;
import main.model.BoardModel;
import main.model.Cell;
import main.status.GameStatus;
import main.utils.config.Configuration;
import main.view.frame.SnakeJFrame;

import javax.swing.*;
import java.awt.*;

public class BoardView {

    private BoardService boardService = new BoardService();

    private SnakeJFrame frame;
    private JPanel mainPanel;
    private GameStatus gameStatus = GameStatus.LOADING;

    private BoardModel model;
    private BoardController controller;

    public BoardView(BoardController controller, BoardModel board) {
        this.model = board;
        this.controller = controller;
    }

    public void getReady() {
        initConfiguration();
        setGameModels();
        initView();
        initGameThread();
        setStartStatus();
    }

    void initGameThread() {
        
    }

    private void setGameModels() {
        controller.initBoard(Configuration.boardWidth, Configuration.boardHeight);
        controller.initSnake();

    }

    private void initConfiguration() {
        boardService.setInitialCellsType();

    }

    private void initView() {
        frame = new SnakeJFrame();
        mainPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Cell[][] board = model.getBoard();
                for (Cell[] arr : board) {
                    for (Cell cell : arr) {
                        ImageIcon imageIcon = new ImageIcon(cell.getType().getImage());
                        imageIcon.paintIcon(
                                this, g,
                                cell.getX() * Configuration.iconSize,
                                cell.getY() * Configuration.iconSize);
                    }
                }
            }
        };
        mainPanel.setPreferredSize(new Dimension(Configuration.boardWidth * Configuration.iconSize, Configuration.boardHeight * Configuration.iconSize));
        frame.add(mainPanel);
        frame.pack();
    }

    private void setStartStatus() {
        gameStatus = GameStatus.IN_PROCESS;
    }


}
