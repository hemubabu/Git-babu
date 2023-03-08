package com.programming;

public class ArrayProgram {
	public static void main(String[] args) {
		int[]a= new int[5];
		int length = a.length;
		a[0]=100;
		a[1]=900;
		a[2]=1000;
		a[3]=500;
		a[4]=600;
		int c;
		System.out.println(length);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
				
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[a.length-2]); // second min
	}

}
