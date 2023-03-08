package com.programming;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a,b,c;
		a=0;
		b=1;
		System.out.println("Fibonacci series is");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=6;i++) {
			c=a+b;//1,2
			a=b;//1,1
			b=c;//1	
			System.out.println(c);
		}
		
	}

}
