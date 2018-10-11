package com.timeinc.practice.String;

public class PermutationOfString {
	
	public static void main(String[] args) {
		getPermute("AABC");
	}
	
	public static void getPermute(String letter)
	{
		if(letter.length()==0)
		{
			System.out.println("Enter a letter with length greater > 0");
		}
		else
		{
			calculatePermutation("",letter);
		}
	}
	
	public static void calculatePermutation(String prefix,String remaining)
	{
		if(remaining.length()==0)
		{
			System.out.println(prefix);
		}
		
		for(int i=0;i<remaining.length();i++)
		{
			calculatePermutation(prefix+remaining.charAt(i),remaining.substring(0, i)+remaining.substring(i+1,remaining.length()));
		}
	}

}
