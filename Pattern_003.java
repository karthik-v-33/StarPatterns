package com.GitHub_Updates;

public class Pattern_003 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int colx=1;colx<row;colx++) {
				System.out.print(" ");
			}
			for(int col=3;col>=row;col--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
