package com.cpg.tictactoe;

import java.util.*;

public class TicTacToe {
	Scanner sc = new Scanner(System.in);

	private char[] createBoard() {
		// creating char array of size 10
		char[] ticTacToeBoard = new char[10];
		// initializing array
		for (int i = 1; i < 10; i++) {
			ticTacToeBoard[i] = ' ';
		}
		return ticTacToeBoard;
	}

	private char chooseLetter() {
		System.out.println("Choose a Letter 'X' or 'O");
		char userLetter = sc.next().charAt(0);
		return Character.toUpperCase(userLetter);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Progarm");
		// creating object of class TicTacToe
		TicTacToe board = new TicTacToe();
		char[] ticTacToeBoard = board.createBoard();
		// calling choose letter method
		char userChoice = board.chooseLetter();
		char computerChoice;
		if (userChoice == 'X')
			computerChoice = 'O';
		else
			computerChoice = 'X';
		System.out.println("Chosen letter for player is :" + userChoice);
		System.out.println("Chosen letter for computer is :" + computerChoice);
	}
}
