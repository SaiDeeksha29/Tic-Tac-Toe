package com.blz.training;

import java.util.Scanner;

public class TicTacToe {

	// Variables
	private static char computer;
	private static char[] board;
	private static char userChoice;

	// Create Board and Assign Empty Spaces
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++)
			board[i] = ' ';
		return board;
	}

	// Selection of Letter by User
	private static char chooseUserLetter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your User Letter X or O");
		char userChoice = sc.next().charAt(0);
		return userChoice;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game");
		board = createBoard();
		userChoice = chooseUserLetter();

		// Assigning Letter to Computer
		if (userChoice == 'X')
			computer = 'O';
		else
			computer = 'X';
		System.out.println("Computer letter is " + computer);
	}
}
