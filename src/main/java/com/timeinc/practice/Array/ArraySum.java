package com.timeinc.practice.Array;

public class ArraySum {
	
	public static void main(String[] args) {
		
		
		int sum=0;
		int counter=0;
		int arr[] = {20, 30, 25, 35, -16, 60, -100};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			counter++;
			
		}
		
		System.out.println(sum);
		System.out.println("Averge :"+sum/counter);
		
	}

}
