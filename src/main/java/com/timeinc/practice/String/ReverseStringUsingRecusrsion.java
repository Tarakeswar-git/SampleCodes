package com.timeinc.practice.String;

public class ReverseStringUsingRecusrsion {
	
	public static void main(String[] args) {
		
		String reverse=reverse("pradhan");
		System.out.println(reverse);
		
	
	}
	
	public static String reverse(String str)
	{
		if(str.length()==0)
		{
			return str;
		}
		
		return reverse(str.substring(1))+str.charAt(0);
	}

}
