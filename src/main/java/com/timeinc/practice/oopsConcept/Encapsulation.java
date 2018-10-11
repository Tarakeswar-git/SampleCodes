package com.timeinc.practice.oopsConcept;

public class Encapsulation {
	
	private int mobNo;
	private String empName;
	private int empAge;
	
	public int getMobNo()
	{
		return mobNo;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
	
	public void setMobNo(int mobNo)
	{
		this.mobNo=mobNo;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public void setEmpAge(int empAge)
	{
		this.empAge=empAge;
	}

}
