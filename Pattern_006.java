package com.GitHub_Updates;

public class Pattern_006 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--) {
			for(int colx=1;colx<row;colx++) {
				System.out.print(" ");
			}
			for(int col=3;col>=row;col--) {
				System.out.print("*");
			}
			for(int col1=3;col1>row;col1--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row2=2;row2>=1;row2--) {
			for(int colz=2;colz>=row2;colz--) {
				System.out.print(" ");
			}
			for(int col2=1;col2<=row2;col2++) {
				System.out.print("*");
			}
			for(int col3=1;col3<row2;col3++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
