package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;

public class StudentController {
	//StudentModel
	//StudentView
	
	
	private StudentModel studentmodel;
	private StudentView studentview;
	
	
	public StudentController(StudentModel studentmodel,StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
		
//=======================================================================================
		
	}
	
	public void setStudentName(String name) {
		studentmodel.setName(name);
	}
	
	public void setStudentAge(int age) {
		studentmodel.setAge(age);
	}
	
	
	public String getStudentName() {
		return studentmodel.getName();
		
	}
	public int getStudentAge() {
		return studentmodel.getAge();
	}
	
	public void updateView() {
		//
		studentview.displayInfo(getStudentName(), getStudentAge());
	}

}
