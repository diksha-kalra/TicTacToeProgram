package com.cpg.tictactoe;

import java.util.*;

public class TicTacToe {
	Scanner sc = new Scanner(System.in);
	public static final int HEAD = 0;
	public static final int TAIL = 1;

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

	private int getUserMove(char[] b) {
		int location = 0;
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

	private int getComputerMove(char[] b, char computerChoice, char userChoice) {
		int location = 0;
		while (true) {
			location = (int) Math.floor(Math.random() * 10) % 10;
			if (b[location] != ' ')
				continue;
			else {
				break;
			}
		}
		return location;
	}

	private char[] moveToLocation(char userChoice, char[] b, int index) {
		b[index] = userChoice;
		return b;
	}

	private int tossToChoosePlayer() {
		int tossOutcome = (int) Math.floor(Math.random() * 10) % 2;
		return tossOutcome;
	}

	private static boolean isWinner(char[] b, char ch) {
		return ((b[1] == ch && b[2] == ch && b[3] == ch) || (b[4] == ch && b[5] == ch && b[6] == ch)
				|| (b[7] == ch && b[8] == ch && b[9] == ch) || (b[1] == ch && b[4] == ch && b[7] == ch)
				|| (b[2] == ch && b[5] == ch && b[8] == ch) || (b[3] == ch && b[6] == ch && b[9] == ch)
				|| (b[1] == ch && b[5] == ch && b[9] == ch) || (b[3] == ch && b[5] == ch && b[7] == ch));
	}

	private void TicTacToeApp(int tossOutcome, char[] board, char userChoice, char computerChoice) {
		int indexUser, indexComputer;
		boolean result = false;
		while (result != true) {

			if (tossOutcome == HEAD) {
				System.out.println("User plays first");
				indexUser = getUserMove(board);
				board = moveToLocation(userChoice, board, indexUser);
				showBoard(board);
				result = isWinner(board, userChoice);
				if (result == true) {
					System.out.println("User Wins");
					break;
				}
				indexComputer = getComputerMove(board, computerChoice, userChoice);
				board = moveToLocation(computerChoice, board, indexComputer);
				showBoard(board);
				result = isWinner(board, computerChoice);
				if (result == true) {
					System.out.println("Computer Wins");
					break;
				}
			} else if (tossOutcome == TAIL) {
				System.out.println("Computer plays first");
				indexComputer = getComputerMove(board, computerChoice, userChoice);
				board = moveToLocation(computerChoice, board, indexComputer);
				showBoard(board);
				result = isWinner(board, computerChoice);
				if (result == true) {
					System.out.println("Computer Wins");
					break;
				}
				indexUser = getUserMove(board);
				board = moveToLocation(userChoice, board, indexUser);
				showBoard(board);
				result = isWinner(board, userChoice);
				if (result == true) {
					System.out.println("User Wins");
					break;
				}
			}
		}
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
		int tossOutcome = board.tossToChoosePlayer();
		board.TicTacToeApp(tossOutcome, ticTacToeBoard, userChoice, computerChoice);
	}
}
