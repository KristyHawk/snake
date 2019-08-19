package main.controller.services;

import main.model.Snake;
import main.utils.config.Configuration;
import main.model.Cell;
import main.status.CellType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class which describes logic of generation that is related to board
 */
public class BoardService {

    private int width = Configuration.boardWidth;
    private int height = Configuration.boardHeight;

    /**
     * Fills board with empty cells
     * @return Cell[][]
     */
    public Cell[][] initEmptyBoard() {
        Cell[][] board = new Cell[width][height];
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                board[w][h] = new Cell(w, h, CellType.EMPTY);
            }
        }
        return board;
    }

    public Snake initSnake() {
        Snake snake = new Snake();
        snake.setX(width/2);
        snake.setY(height/2);

        List<Cell> body = new ArrayList<>();
        body.add(new Cell(width/2, height/2-1, CellType.SNAKE));
        snake.setBody(body);

        return snake;
    }

    /**
     * Ties cell types to images in CellType enum
     */
    public void setInitialCellsType() {
        BufferedImage bufferedImage;
        for (CellType cellType : CellType.values()) {
            try {
                bufferedImage = ImageIO.read(new File("src/resources/icons/" + cellType.name() + ".png"));
                cellType.setImage(bufferedImage);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Can't associate images to the initial field");
            }
        }
    }
}
