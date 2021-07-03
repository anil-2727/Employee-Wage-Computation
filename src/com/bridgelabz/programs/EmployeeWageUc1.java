package com.bridgelabz.programs;

public class EmployeeWageUc1 {

	public static void main(String[] args) {

		int Is_Full_Time = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		System.out.println("empCheck=" + empCheck);

		if (empCheck == Is_Full_Time)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
