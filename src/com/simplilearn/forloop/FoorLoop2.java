package com.simplilearn.forloop;

public class FoorLoop2 {

	public static void main(String[] args) {
		
		// WAP for finding total and average of employees salary.
		
		double salaries[]  = { 20000, 20343, 22323, 23244, 45534, 343343};
		
		double totalSal = 0.0;
		double avgSal = 0.0;
		
		// iterate every salary
		for(int index=0 ; index < salaries.length; index++) {
			System.out.println("The Emplyee No. "+ index + "  with Salary :"+salaries[index]);
			totalSal = totalSal + salaries[index];
		}
		avgSal = totalSal  / salaries.length;
		
		System.out.println("The Total Salary of all employees :"+totalSal);
		System.out.println("The Average Salary of all employees :"+avgSal);

	}

}
