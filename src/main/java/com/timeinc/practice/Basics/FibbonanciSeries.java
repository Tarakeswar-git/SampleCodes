package com.timeinc.practice.Basics;

import org.apache.http.impl.execchain.MainClientExec;

public class FibbonanciSeries {
	
	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		
		System.out.print(i+" "+j);
		
		for(int k=0;k<20;k++)
		{
			int sum=i+j;
			System.out.print(" "+sum);
			i=j;
			j=sum;
		}
	}

}
