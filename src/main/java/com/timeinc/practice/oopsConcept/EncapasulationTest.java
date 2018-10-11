package com.timeinc.practice.oopsConcept;

public class EncapasulationTest {
	
	public static void main(String[] args) {
		
		String s1="Tarakeswar";
		
		s1="Lipa";
		
		System.out.println(s1);
		
	         Encapsulation obj = new Encapsulation();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setMobNo(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee Mob: " + obj.getMobNo());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}

