package org.ucode.javapractice;

/*
http://www.programmingbydoing.com/a/tic-tac-toe-oop.html
 */

public class TicTacToeV3 {
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeV3() {
        board = new char[3][3];
        turns = 0;

        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner( char p ) {
        for (int r = 0; r < 3; r++) {
            if (p == (board[r][0]) && board[r][0] == (board[r][1]) && board[r][1] ==(board[r][2]))
                return true;
        }
        for (int c = 0; c < 3; c++) {
            if (p == (board[0][c]) && board[0][c] == (board[1][c]) && board[1][c] == (board[2][c]))
                return true;
        }
        if (p == (board[0][0]) && board[0][0] == (board[1][1]) && board[1][1] == (board[2][2]))
            return true;
        else if (p == (board[0][2]) && board[0][2] == (board[1][1]) && board[1][1] == (board[2][0])){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (numTurns()==10){
            return true;
        }
        else return false;
    }

    public boolean isCat() {
        if (numTurns()==10 && !isWinner('X') && !isWinner('O')){
            return true;
        }
        else return false;
    }

    //wip
    public boolean isValid( int r, int c ) {
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
            return true;
        else
            return false;
    }

    public int numTurns() {
        turns++;
        return turns;
    }


    //wip
    public char playerAt( int r, int c ) {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


    //wip
    // Modifiers
    public void playMove( char p, int r, int c ) {
        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            p = board[r][c];
    }
}
