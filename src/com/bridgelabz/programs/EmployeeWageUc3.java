package com.bridgelabz.programs;

public class EmployeeWageUc3 {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int Is_PART_TIME = 2;

		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("empCheck=" + empCheck);

		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
		} else if (empCheck == Is_PART_TIME) {
			empHrs = 4;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("EmployeeWage =" + empWage);
	}

}
