package com.timeinc.practice.Array;

import java.util.Arrays;

public class RightSideHighestElement {
	
	public static void main(String []args){
        int [] arr= {1,89,87,89,5,7,9,1};
        int temp=0;

        for(int i=0;i<arr.length-1;i++){
            int next_element=arr[i+1];
            for(int j=i+1;j<arr.length-1;j++){
                temp=arr[j];

                if(temp>next_element)
                next_element=temp;



            }
            arr[i]=next_element;
        }
        System.out.println(Arrays.toString(arr));



    }

}
