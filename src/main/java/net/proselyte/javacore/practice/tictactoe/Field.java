package net.proselyte.javacore.practice.tictactoe;

import java.util.Scanner;

public class Field {
    //variable for creating field:
    public final int AMOUNT_ROWS = 3, AMOUNT_COLUMNS = 3;
    public String[][] grid = new String[AMOUNT_ROWS][AMOUNT_COLUMNS];


    public void showGrid() {
        for (int row = 0; row < AMOUNT_ROWS; row++) {
            for (int column = 0; column < AMOUNT_COLUMNS; column++) {
                System.out.print(grid[row][column]); // output each of the cells

                if (column != AMOUNT_COLUMNS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row != AMOUNT_ROWS - 1) {
                System.out.println("-----------");
            }
        }


        System.out.println();
    }


}
