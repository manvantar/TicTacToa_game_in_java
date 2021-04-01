package com.bridgelabz.tictactoe_game;
import java.util.*;
public class TicTakToa {

	char[] createArray(int size){
		char []a=new char[size];
		for(int i=1;i<size;i++) {
			a[i]=' ';	
		}
		return a;
	}

	char chooseXorO(){
		char xoro=' ';

		while(xoro!='x' && xoro !='o' && xoro !='X'&&xoro!='O') {
			System.out.println("Player 1 select X or O");
			Scanner s=new Scanner(System.in);
			xoro=s.next().charAt(0);
		}
		if(xoro=='X') {
			xoro='x';
			System.out.println("Player 2 have to use 'o'");
		}
		else if(xoro=='O') {
			xoro='o';
			System.out.println("Player 2 have to use 'x'");
		}
		
		return xoro;

	}
}