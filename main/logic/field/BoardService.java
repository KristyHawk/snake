package main.logic.field;

import main.config.Configuration;
import main.models.Cell;
import main.status.CellType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BoardService {

    private int width = Configuration.boardWidth;
    private int height = Configuration.boardHeight;

    public Cell[][] fillBoard() {
        Cell[][] board = new Cell[width][height];
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                board[w][h] = new Cell(w, h, CellType.EMPTY);
            }
        }
        return board;
    }

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
