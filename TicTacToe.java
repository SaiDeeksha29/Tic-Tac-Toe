package com.blz.training;

import java.util.Scanner;

public class TicTacToe {

	// Create board with Empty Spaces
	private char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// Player to choose the letter
	private char choosePlayerLetter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your letter: ");
		char playerLetter = input.next().toUpperCase().charAt(0);
		input.close();
		return playerLetter;
	}

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to TicTacToe program");

		TicTacToe cb = new TicTacToe();
		cb.createBoard();
		char userLetter=cb.choosePlayerLetter();
		char computerLetter;
		if (userLetter == 'X') {
			computerLetter = 'O';
		} else {
			computerLetter = 'X';
		}
		System.out.println("Computer letter is : " + computerLetter);
		
	}

}
