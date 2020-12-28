package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.initializeBoard();
        System.out.println("Tic-Tac-Toe!");

        do
        {
            System.out.println("Текущая доска :");
            game.printBoard();
            int row;
            int col;
            do
            {
                System.out.println("Игрок " + game.getCurrentPlayerMark() + ", Введите номер строки а затем номер столбца куда собираетесь поставить знак");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeMark(row, col));
            game.changePlayer();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("Ничья!");
        }
        else
        {
            System.out.println("Текущая доска :");
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " Победил");
        }
    }
}
