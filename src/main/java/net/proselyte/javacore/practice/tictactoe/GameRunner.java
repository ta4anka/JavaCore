package net.proselyte.javacore.practice.tictactoe;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic game = new GameLogic();
        game.start();

        do {
            game.getPlayerInput();
            game.analyzeGrid();
            game.showGrid();

            if (game.statusGame==game.STATUS_WINNING_X){
                System.out.println("'X' won!");
            } else if (game.statusGame==game.STATUS_WINNING_0){
                System.out.println("'O' won!");
            } else if (game.statusGame==game.STATUS_DRAW){
                System.out.println("It's a Draw! Go to hell!");
            }
            game.currentPlayer = (game.currentPlayer == game.CROSS?game.ZERO:game.CROSS);// Switch player
        }

        while (game.statusGame==game.STATUS_GAME_CONTINUES);
    }
}
