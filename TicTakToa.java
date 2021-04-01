package com.bridgelabz.tictactoe_game;

public class TicTakToa {

	char[] createArray(int size){

		char []a=new char[size];

		for(int i=1;i<size;i++) {
			a[i]=' ';	
		}

		return a;
	}


}
