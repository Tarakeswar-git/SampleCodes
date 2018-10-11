package com.timeinc.practice.Array;

import java.util.Arrays;

public class Separate0And1 {
	
	public static void main(String[] args) {
		
		
		
		int arr[] = { 0, 0, 1, 1, 0, 1, 1, 1,0 };
		
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[counter]=arr[i];
				counter++;
			}
		}
		
		while(counter<arr.length)
		{
			arr[counter]=0;
			counter++;
		}
		
		System.out.println(Arrays.toString(arr));
		 
	}

}
