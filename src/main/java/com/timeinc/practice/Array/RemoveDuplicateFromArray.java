package com.timeinc.practice.Array;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	
	
	public static void main(String[] args) {
		
		removeDuplicateFromArray((new int[] {4, 3, 2, 4,9,9,2}));
		
	}
	
	public static void removeDuplicateFromArray(int[] arrayWithDuplicates)
	{
		
		int noOfUniqueElement=arrayWithDuplicates.length;
		for(int i=0;i<noOfUniqueElement;i++)
		{
			for(int j=i+1;j<noOfUniqueElement;j++)
			{
				if(arrayWithDuplicates[i]==arrayWithDuplicates[j])
				{
					arrayWithDuplicates[j]=arrayWithDuplicates[noOfUniqueElement-1];
					noOfUniqueElement--;
					j--;
					
				}
			}			
			
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElement);
		System.out.println(Arrays.toString(arrayWithoutDuplicates));
	}

}
