package com.timeinc.practice.String;

public class RemoveSpecialCharFromString {
	
	public static void main(String[] args) {
		
		/*String str="Hello, how are you ?";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9_-]"," "));*/
		
		 String str="gasd@!dfas%";
	        String newStr="";
	          for (int i=0;i<str.length();i++)
	          {
	              
	              if (str.charAt(i)>64&&str.charAt(i)<121)
	              {
	                    newStr+=str.charAt(i);
	              }
	          }
	 
	         System.out.println("String before filter "+str);
	        System.out.println("String after filter "+newStr);
	     
	 
	    }
	

}
