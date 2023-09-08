package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserController {
	
	private UserModel usermodel;
	private UserView userview;
	
	// �� ���� �ҷ����� ������û > �������ذ� ���޹ޱ�
	
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	
	}	
	
	public void setView(UserView userview) {
		this.userview = userview;
	}
	
	public void setModel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	
	public UserView getView() {
		return userview;
	}
		
	
	public UserModel getModel() {
		return usermodel;
	}	
	
	public void update() {
		
	}

	



	



		
		
		
		
	}
	

	
	
	
	
		
		/*
		 * �𵨰� �並 �����ϴ� ��
		 * ����� �Է��� ó���ϴ� �� 
		 * 
		 * */

	


