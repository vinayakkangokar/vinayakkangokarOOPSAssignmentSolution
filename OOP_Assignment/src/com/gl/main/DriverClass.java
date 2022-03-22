package com.gl.main;

import com.gl.department.*;

public class DriverClass {

	public static void main(String[] args) {
		
		// Admin Department Messages	
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println("Welcome to" + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork().trim());
		System.out.println(adminDepartment.getWorkDeadline().trim());
		System.out.println(adminDepartment.isTodayAHoliday().trim() + "\n");

		// Hr Department Messages
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println("Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity().trim());
		System.out.println(hrDepartment.getTodaysWork().trim());
		System.out.println(hrDepartment.getWorkDeadline().trim());
		System.out.println(hrDepartment.isTodayAHoliday().trim() + "\n\n");

		// Tech Department Messages
		TechDepartment techDepartment = new TechDepartment();
		System.out.println("Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork().trim());
		System.out.println(techDepartment.getWorkDeadline().trim());
		System.out.println(techDepartment.getTechStackInformation().trim());
		System.out.println(techDepartment.isTodayAHoliday().trim());
	}

}
