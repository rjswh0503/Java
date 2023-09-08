package com.kh.pattern.mvc;

import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {

	public static void main(String[] args) {
		//모델객체 생성 Model
		StudentModel model = new StudentModel("학생",17);
		
		
		//view객체 생성 view
		StudentView	 view = new StudentView();
		
		//컨트롤러 객체 생성 controller
		StudentController controller = new StudentController(model,view);
		//학생 정보를 업데이트해서 출력
		controller.updateView();
		//학생 정보 업데이트 하자
		controller.setStudentName("업데이트");
		controller.setStudentAge(18);
		
		controller.updateView();
		
		
	
		
		//뷰 객체 생성 View
		
		
		
		
		
		
		
		//컨트롤러 객체 생성 Controller + (모델 뷰 설정)
		
		
		
		
		
		
		
		//학생 정보를 업데이트해서 출력
		
		
		
		
		
		
		
		
		//학생 정보 업데이트를 하자
		
		
		
		
		
		
		
		
		
		//업데이트 된 학생 정보를 출력
		
		
	
		
		

	}

}
