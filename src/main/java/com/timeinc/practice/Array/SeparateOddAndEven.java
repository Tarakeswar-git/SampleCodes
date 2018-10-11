package com.timeinc.practice.Array;

import java.util.Arrays;

public class SeparateOddAndEven {
	
	public static void main(String[] args) {
		
		int[] arr={1,2,5,4,3,8,9,10};
		
		int[] resultarray=new int[arr.length];
		
		int left=0;
	    int right=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				resultarray[left]=arr[i];
				left++;
			}
			else
			{
				resultarray[right]=arr[i];
				right--;
			}
		}
		
		System.out.println(Arrays.toString(resultarray));
	}

}
