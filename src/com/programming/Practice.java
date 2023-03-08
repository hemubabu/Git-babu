package com.programming;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
		String S =  "India is my Country";
		int l = S.length();
		char c = S.charAt(4);
		System.out.println(c);
		String s1 =S.toUpperCase();
		System.out.println(s1);
		int lastIndexOf = S.lastIndexOf('i');
		System.out.println(lastIndexOf);
		String t=S.trim();
		System.out.println(t);
		String S2=S.substring(6,11);
		System.out.println(S2);
		String[] s3=S.split("my");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
		
		}
		
	}
