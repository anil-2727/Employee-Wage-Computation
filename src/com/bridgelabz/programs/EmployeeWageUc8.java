package com.bridgelabz.programs;

public class EmployeeWageUc8 {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "EmpHr : " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total EmployeeWage for company : " + company + "is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("BigBazzar", 25, 2, 10);
		computeEmpWage("D Mart", 20, 3, 15);
	}

}
