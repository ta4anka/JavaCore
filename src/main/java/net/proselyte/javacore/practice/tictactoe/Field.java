package net.proselyte.javacore.practice.tictactoe;
public class Field {
    private final int AMOUNT_ROWS = 3, AMOUNT_COLUMNS = 3;
    private String[][] grid = new String[AMOUNT_ROWS][AMOUNT_COLUMNS];

    public int getAMOUNT_ROWS() {
        return AMOUNT_ROWS;
    }

    public int getAMOUNT_COLUMNS() {
        return AMOUNT_COLUMNS;
    }

    public String[][] getGrid() {
        return grid;
    }

    //------------a crazy constructor----------------------
    public Field(){
        for (int row = 0; row < AMOUNT_ROWS; row++) {
            for (int column = 0; column < AMOUNT_COLUMNS; column++) {
                grid[row][column] = "   ";
            }
        }
    }
//---------------------------------------------------------

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


