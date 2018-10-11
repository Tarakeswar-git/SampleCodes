package com.timeinc.practice.oopsConcept;

public class StaticExamples {
	
	static String str;
	static int variable2;
   int variable1;
   
   public StaticExamples(int i)
   {
	   System.out.println("Call constructor");
   }
   
   
	
   static
   {
	   variable2=20;
   }
	
	{
		variable1=10;
	}
	
	public static void main(String[] args) {
		
		System.out.println(str);
		System.out.println(variable2);
		add(30, 40);
	
		StaticExamples s1=new StaticExamples(10);
		System.out.println(s1);
		System.out.println(s1.variable1);
		s1.mul();
		
		StaticExamples s2=new StaticExamples(10);
		s2.variable1=30;
		System.out.println(s2);
		System.out.println(s2.variable1);
		s2.mul();
		
	}
	
	
	public static void add(int i,int j)
	{
		int sum=i+j;
		System.out.println("Sum is: "+sum);
	}
	
	public  void mul()
	{
		int mul=30*10;
		System.out.println("mul is: "+mul);
	}

}
