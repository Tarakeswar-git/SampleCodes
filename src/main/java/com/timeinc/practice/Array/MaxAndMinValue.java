package com.timeinc.practice.Array;

public class MaxAndMinValue {
	
	public static void main(String[] args) {
		
	int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	
	int max=arr[0];
	int min=arr[arr.length-1];
	
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			
			max=arr[i];
			
		}
		
	
	}
	
	for(int j=0;j<arr.length;j++)
	{
		if(min>arr[j])
		{
			
			min=arr[j];
			
		}
		
	
	}
	
	
	
	System.out.println(min);
	System.out.println(max);
	}

}
