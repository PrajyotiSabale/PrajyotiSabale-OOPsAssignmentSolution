package com.gradedAssessment.main;

import com.gradedAssessment.classes.AdminDepartment;
import com.gradedAssessment.classes.HrDepartment;
import com.gradedAssessment.classes.SuperDepartment;
import com.gradedAssessment.classes.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		SuperDepartment sd = new SuperDepartment();

		System.out.println(sd.departmentName());
	    System.out.println(sd.getTodayWork());
		System.out.println(sd.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());

		AdminDepartment ad = new AdminDepartment();

		System.out.println(ad.departmentName());
		System.out.println(ad.getTodayWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		HrDepartment hr = new HrDepartment();

		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodayWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		TechDepartment td = new TechDepartment();

		System.out.println(td.departmentName());
		System.out.println(td.getTodayWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getStackInformation());
		System.out.println(td.isTodayAHoliday());

	}

}
