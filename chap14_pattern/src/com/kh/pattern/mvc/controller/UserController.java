package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserController {
	
	private UserModel usermodel;
	private UserView userview;
	
	// 내 정보 불러오고 수정요청 > 수정해준거 전달받기
	
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
		 * 모델과 뷰를 연결하는 곳
		 * 사용자 입력을 처리하는 곳 
		 * 
		 * */

	


