package com.kh.pattern.mvc;

import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {

	public static void main(String[] args) {
		//�𵨰�ü ���� Model
		StudentModel model = new StudentModel("�л�",17);
		
		
		//view��ü ���� view
		StudentView	 view = new StudentView();
		
		//��Ʈ�ѷ� ��ü ���� controller
		StudentController controller = new StudentController(model,view);
		//�л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		//�л� ���� ������Ʈ ����
		controller.setStudentName("������Ʈ");
		controller.setStudentAge(18);
		
		controller.updateView();
		
		
	
		
		//�� ��ü ���� View
		
		
		
		
		
		
		
		//��Ʈ�ѷ� ��ü ���� Controller + (�� �� ����)
		
		
		
		
		
		
		
		//�л� ������ ������Ʈ�ؼ� ���
		
		
		
		
		
		
		
		
		//�л� ���� ������Ʈ�� ����
		
		
		
		
		
		
		
		
		
		//������Ʈ �� �л� ������ ���
		
		
	
		
		

	}

}
