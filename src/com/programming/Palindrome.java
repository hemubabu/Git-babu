package com.programming;

public class Palindrome {
	public static void main(String[] args) {
		int n=555,i,reverse=0,a;
		a=n;
		while(a>0) {
			i=a%10;  //3
			reverse = reverse*10+i; // 3
			a=a/10;
			
		}
		if(n==reverse) {
			System.out.println(n+" "+"is a Palindrome number");
		}
		else
		{
			System.out.println(n+" "+"Not a Palindrome number");
		}
	}

}
