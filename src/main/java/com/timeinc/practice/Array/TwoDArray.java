package com.timeinc.practice.Array;

import java.util.Arrays;

public class TwoDArray {

	
	public static void main(String[] args) {
		
		int[] array={3,4};
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
			{
				array[i]=array[i]+1;
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
