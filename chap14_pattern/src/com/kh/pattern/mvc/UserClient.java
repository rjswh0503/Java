package com.kh.pattern.mvc;
//mvc 패턴이 아님x  Client 출력용
import com.kh.pattern.mvc.controller.UserController;
import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserClient {

	public static void main(String[] args) {
		//모델 객체 생성
		UserModel user = new UserModel("홍길동",20);
		
		
		//뷰 객체 생성
		UserView view = new UserView();
		
		
		//컨트롤러 객체 생성 및 모델 뷰 설정
		UserController controller = new UserController(user, view);
		
		
		//학생 정보를 업데이트해서 출력
		
			
			
			
			

	}

}
