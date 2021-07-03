package com.bridgelabz.programs;

public class EmployeeWageUc5 {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("empCheck=" + empCheck);

			switch (empCheck) {
			case 1:
				System.out.println("Employee is FullTime Present");
				empHrs = 8;
				break;
			case 2:
				System.out.println("Employee is PartTime Present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			empWage = ((EMP_RATE_PER_HOUR) * (empHrs));
			totalEmpWage += empWage;
			System.out.println("EmployeeWage =" + empWage);

		}
		System.out.println("Total EmployeeWage =" + totalEmpWage);
	}
}