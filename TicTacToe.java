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

	private void showBoard(char[] b) {
		System.out.println(" " + b[1] + "|" + b[2] + "|" + b[3]);
		System.out.println("------------");
		System.out.println(" " + b[4] + "|" + b[5] + "|" + b[6]);
		System.out.println("-------------");
		System.out.println(" " + b[7] + "|" + b[8] + "|" + b[9]);
	}
<<<<<<< HEAD
=======

	private int getUserMove(char[] b) {
		int location = 0;
		boolean isFull = true;
		while (true) {
			System.out.println("User enter the location between 1 to 9");
			location = sc.nextInt();
			if (b[location] != ' ') {
				System.out.println("Board Position Occupied enter another location");
				continue;
			} else {
				break;
			}
		}
		return location;
	}
>>>>>>> UC_4_Move_To_Location

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
		board.showBoard(ticTacToeBoard);
<<<<<<< HEAD
=======
		int index = board.getUserMove(ticTacToeBoard);
>>>>>>> UC_4_Move_To_Location
	}
}
