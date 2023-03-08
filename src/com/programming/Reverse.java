package com.programming;

public class Reverse {
	public static void main(String[] args) {
		int a = 123456;
		int b=0;
		int reverse=0;
		while(a>0) {
			b=a%10;
			reverse=reverse*10+b;
			a=a/10;				
		}
		System.out.println(reverse);
		
		
	
	}

}
