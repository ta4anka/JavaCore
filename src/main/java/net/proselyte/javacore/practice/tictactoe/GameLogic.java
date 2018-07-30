package net.proselyte.javacore.practice.tictactoe;

import java.util.Scanner;

public class GameLogic extends Field {

    // current player(CROSS or ZERO)
    public String currentPlayer;
    //variables for  representing the contents of field
    public final String EMPTY_CELL = "   ", CROSS = " X ", ZERO = " O ";

    //variables for  representing the various states of the game
    public  int statusGame;
    public  final int STATUS_GAME_CONTINUES=0, STATUS_DRAW = 1, STATUS_WINNING_X = 2, STATUS_WINNING_0 = 3;

    public Scanner in = new Scanner(System.in);

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void start() {
        for (int row = 0; row < AMOUNT_ROWS; row++) {
            for (int column = 0; column < AMOUNT_COLUMNS; column++) {
                grid[row][column] = EMPTY_CELL;
            }
        }
        currentPlayer = CROSS;
        showGrid(); // print empty grid
    }


    public void getPlayerInput() {
        //  checking  whether user input is allowed (does not go beyond boundary)
        //  or indicating that the cell already used.
        boolean inputIsValid = false;
        do {
            System.out.println("Player '" + currentPlayer + "', enter row (1-3) and column (1-3) separated by space: ");
            int row = in.nextInt() - 1;
            int column = in.nextInt() - 1;

            if (row >= 0 && row < AMOUNT_ROWS && column >= 0 && column < AMOUNT_COLUMNS && grid[row][column] == EMPTY_CELL) {
                grid[row][column] = currentPlayer;
                inputIsValid = true;// to stop loop!

            } else {
                System.out.println("Selected cell (" + (row + 1) + "," + (column + 1)
                        + ") can't be used. Try again ...");
            }
        } while (!inputIsValid);

    }



    public void analyzeGrid() {

        String winner = findWinner();
        if (winner.equals(CROSS)){
            statusGame = STATUS_WINNING_X;
        } else if (winner.equals(ZERO)){
            statusGame = STATUS_WINNING_0;
        } else if (checkFillingCells()){
            statusGame = STATUS_DRAW;
        } else {
            statusGame = STATUS_GAME_CONTINUES;
        }
    }



//==========================================================================

    public String findWinner() {

        int amountIdenticalCells;
        // 3 in row
        for (int row = 0; row < AMOUNT_ROWS; row++) {
            amountIdenticalCells = 0;//for zeroing
            for (int column = 0; column < AMOUNT_COLUMNS; column++) {
                if (grid[row][0] != EMPTY_CELL && grid[row][0] == grid[row][column]) {
                    amountIdenticalCells++;
                }
            }
            if (amountIdenticalCells == 3) {
                return grid[row][0];  //winner(x or o)
                }
        }

        // 3 in column
        for (int column = 0; column < AMOUNT_COLUMNS; column++) {
            amountIdenticalCells = 0;
            for (int row = 0; row < AMOUNT_ROWS; row++) {
                if (grid[0][column] != EMPTY_CELL && grid[0][column] == grid[row][column]) {
                    amountIdenticalCells++;
                }
            }
            if (amountIdenticalCells == 3) {
                return grid[0][column];
            }
        }

//        3 by diagonally from left to right
        if (grid[0][0] != EMPTY_CELL && grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]) {
            return grid[0][0];
        }

        // 3 by diagonally from right to left
        if (grid[0][2] != EMPTY_CELL && grid[1][1] == grid[0][2] && grid[2][0] == grid[0][2]) {
            return grid[0][2];
        }

        return EMPTY_CELL; // if there isn't winner
    }
//==============================================================

    public boolean checkFillingCells() {
        for (int row=0; row<AMOUNT_ROWS; row++){
            for (int column=0; column < AMOUNT_COLUMNS; column++){
                if (grid[row][column]==EMPTY_CELL){
                    return false; // there is empty cell
                }
            }
        }
        return true; // empty cells not found
    }

}
