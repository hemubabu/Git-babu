package com.oops;

public class ClassConcept1 {
	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col1=3;col1>row;col1++) {
				System.out.print(" ");
			}
			for(int col2=1;col2<=row;col2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
	
	}
