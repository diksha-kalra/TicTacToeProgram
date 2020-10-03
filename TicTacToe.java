package com.cpg.tictactoe;

public class TicTacToe {
	
	public void CreateBoard() {
		char [] ticTacToeBoard=new char[10];
		for(int i=0;i<10;i++) {
			ticTacToeBoard[i]=' ';
		}
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe Progarm");
		TicTacToe board = new TicTacToe();
		board.CreateBoard();   // method call
	}

}
