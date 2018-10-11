package com.timeinc.practice.Array;

import org.apache.http.impl.execchain.MainClientExec;

public class FindMissingNumber {

	
	public static void main(String[] args) {
		
		
		int[] noOfElements={1,2,3,5,8,7,4};
		
		int totalSum=8*(8+1)/2;
		int sum=0;
		
		for(int i=0;i<noOfElements.length;i++)
		{
			sum=sum+noOfElements[i];
		}
		
		System.out.println("Missing number is :"+(totalSum-sum));
	}
}
