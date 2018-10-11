package com.timeinc.practice.oopsConcept;

import org.apache.http.impl.execchain.MainClientExec;

public class ChildClass extends ParentClass {
	
	int k=20;
	
	public void methodTwo()
	{
		System.out.println("i am in child class");
	}
	
	public static void main(String[] args) {
		
		ParentClass ch=new ChildClass();
		System.out.println(ch.j);
		//System.out.println(ch.k);
		
		ch.methodOne();
		//ch.methodTwo();
	}

}
