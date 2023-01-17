package com.GitHub_Updates;

public class Pattern_004 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--) {
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
