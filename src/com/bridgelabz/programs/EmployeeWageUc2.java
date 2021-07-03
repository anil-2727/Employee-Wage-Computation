package com.bridgelabz.programs;

public class EmployeeWageUc2 {
	
	public static void main(String[] args) {
		int Is_Full_Time = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("empCheck=" + empCheck);

		if (empCheck == Is_Full_Time) {
			System.out.println("Employee is Present");
			empHrs = 8;
		}

		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("EmployeeWage =" + empWage);

	}
}