package com.bridgelabz;

public class tictoctoegame {

		
private static char[] element;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game....!!!");
		board();
	}
	
   
	
	private static void board() {
		element = new char[10];
		for(int i=1; i<10; i++) {
			element[i]='.';
		}
	}
}