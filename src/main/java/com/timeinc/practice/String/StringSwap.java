package com.timeinc.practice.String;

public class StringSwap {

	public static void main(String[] args) {
		
		
		String s1="Tara";
		String s2="Lipa";
		
		String totalString=s1+s2;
		
		s1=totalString.substring(s2.length());
		s2=totalString.substring(0,totalString.length()-s2.length());
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
}
