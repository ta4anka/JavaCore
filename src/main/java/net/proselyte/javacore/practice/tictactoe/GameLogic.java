package net.proselyte.javacore.practice.tictactoe;

import java.util.Scanner;

public class GameLogic{
    public String currentPlayer;
    public final String EMPTY_CELL = "   ", CROSS = " X ", ZERO = " O ";
    public   GameStatus statusGame;
    public Scanner in;
    Field field;


    public GameLogic() {
        this.field = new Field();
        this.in = new Scanner(System.in);
    }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void start() {
        currentPlayer = CROSS;
        field.showGrid(); // print empty field.getGrid()
        do {
            getPlayerInput();
            analyzeGrid();
            field.showGrid();
            checkGameStatus();
            currentPlayer = (currentPlayer == CROSS?ZERO:CROSS);// Switch player
        }
        while (statusGame==GameStatus.CONTINUE);

    }

    public void getPlayerInput() {
        //  checking  whether user input is allowed (does not go beyond boundary)
        //  or indicating that the cell already used.
        boolean inputIsValid = false;
        do {
            System.out.println("Player '" + currentPlayer + "', enter row (1-3) and column (1-3) separated by space: ");
            int row = in.nextInt() - 1;
            int column = in.nextInt() - 1;

            if (row >= 0 && row < field.getAMOUNT_ROWS() && column >= 0 && column < field.getAMOUNT_COLUMNS() && field.getGrid()[row][column] == EMPTY_CELL) {
                field.getGrid()[row][column] = currentPlayer;
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
            statusGame = GameStatus.WINNING_X;

        } else if (winner.equals(ZERO)){
            statusGame = GameStatus.WINNING_0;


        } else if (checkFillingCells()){
            statusGame = GameStatus.DRAW;
        } else {
            statusGame = GameStatus.CONTINUE;
        }
    }

    public String findWinner() {

        int amountIdenticalCells;
        // 3 in row
        for (int row = 0; row < field.getAMOUNT_ROWS(); row++) {
            amountIdenticalCells = 0;//for zeroing
            for (int column = 0; column < field.getAMOUNT_COLUMNS(); column++) {
                if (field.getGrid()[row][0] != EMPTY_CELL && field.getGrid()[row][0] == field.getGrid()[row][column]) {
                    amountIdenticalCells++;
                }
            }
            if (amountIdenticalCells == 3) {
                return field.getGrid()[row][0];  //winner(x or o)
            }
        }
        // 3 in column
        for (int column = 0; column < field.getAMOUNT_COLUMNS(); column++) {
            amountIdenticalCells = 0;
            for (int row = 0; row < field.getAMOUNT_ROWS(); row++) {
                if (field.getGrid()[0][column] != EMPTY_CELL && field.getGrid()[0][column] == field.getGrid()[row][column]) {
                    amountIdenticalCells++;
                }
            }
            if (amountIdenticalCells == 3) {
                return field.getGrid()[0][column];
            }
        }
        // 3 by diagonally from left to right
        if (field.getGrid()[0][0] != EMPTY_CELL && field.getGrid()[0][0] == field.getGrid()[1][1] && field.getGrid()[0][0] == field.getGrid()[2][2]) {
            return field.getGrid()[0][0];
        }
        // 3 by diagonally from right to left
        if (field.getGrid()[0][2] != EMPTY_CELL && field.getGrid()[1][1] == field.getGrid()[0][2] && field.getGrid()[2][0] == field.getGrid()[0][2]) {
            return field.getGrid()[0][2];
        }
        return EMPTY_CELL; // if there isn't winner
    }
    //==============================================================

    public boolean checkFillingCells() {
        for (int row=0; row<field.getAMOUNT_ROWS(); row++){
            for (int column=0; column < field.getAMOUNT_COLUMNS(); column++){
                if (field.getGrid()[row][column]==EMPTY_CELL){
                    return false; // there is empty cell
                }
            }
        }
        return true; // empty cells not found
    }

    public void checkGameStatus(){
        if (statusGame==GameStatus.WINNING_X){
            System.out.println("'X' won!");
        } else if (statusGame==GameStatus.WINNING_0){
            System.out.println("'O' won!");
        } else if (statusGame==GameStatus.DRAW){
            System.out.println("It's a Draw! Go to hell!");
        }
    }
}
