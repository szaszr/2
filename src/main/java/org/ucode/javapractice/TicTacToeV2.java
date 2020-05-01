package org.ucode.javapractice;

/*
http://www.programmingbydoing.com/a/tic-tac-toe.html
 */

import java.util.Scanner;

public class TicTacToeV2 {
    private static char[][] board = new char[3][3];

    public static void main( String[] args ){
            Scanner sc = new Scanner(System.in);

            System.out.print("Player one please choose your sign (O or X): ");
            String input = sc.nextLine();
            char player1 = input.charAt(0);
            char player2;
            if (player1=='O'){
                player2='X';
            }
            else
                player2='O';

            initBoard();
            displayBoard();

            int turn = 1;

            while(true){

                if (turn%2!=0){
                    playerChoice(player1);
                }
                else {
                    playerChoice(player2);
                }
                turn++;
                displayBoard2();

                if (winCheck(player1)){
                    System.out.println("'"+player1+"' wins the game!");
                    break;
                }
                else if (winCheck(player2)){
                    System.out.println("'"+player2+"' wins the game!");
                    break;
                }
                else if (turn>9){
                    System.out.println("This game is a tie.");
                    break;
                }
            }
        }

        private static void playerChoice(char player) {
            Scanner sc = new Scanner(System.in) ;
            System.out.println(player + ", choose your location (row, column): ");
            String move = sc.nextLine();
            String[] moves = (move.split(" "));
            int row = Integer.parseInt(moves[0]);
            int column = Integer.parseInt(moves[1]);
            board[row][column] = player;
        }

        public static boolean winCheck (char player){
            for (int r = 0; r < 3; r++) {
                if (player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2])
                    return true;
            }
            for (int c = 0; c < 3; c++) {
                if (player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c])
                    return true;
            }
            if (player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                return true;
            else if (player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
                return true;
            }
            return false;
        }

        public static void initBoard() {
            // fills up the board with blanks
            for ( int r=0; r<3; r++ )
                for ( int c=0; c<3; c++ )
                    board[r][c] = ' ';
        }

        public static void displayBoard() {
            System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
            System.out.println("    --+-+--");
            System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
            System.out.println("    --+-+--");
            System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
            System.out.println("     0 1 2 ");
        }

        public static void displayBoard2() {
            for ( int r=0; r<3; r++ )
            {
                System.out.print("\t"+r+" ");
                for ( int c=0; c<3; c++ )
                {
                    System.out.print( board[r][c] + " " );
                }
                System.out.println();
            }
            System.out.println("\t  0 1 2 ");
        }
    }
