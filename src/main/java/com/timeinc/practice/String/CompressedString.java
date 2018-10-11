package com.timeinc.practice.String;

public class CompressedString {
	
	  public static void main(String[] args) {
	        
	        String s1="aaabbc";
	    char temp=s1.charAt(0);
	    int count=0;
	    
	    for (int i = 0; i < s1.length(); i++) {
	        if(s1.charAt(i)==temp)
	        {
	            count++;
	        }
	        else
	        {
	            System.out.print(temp+""+count);
	            count=1;
	            temp=s1.charAt(i);
	        }
	        
	    }
	    System.out.print(temp+""+count);
	    }

}
