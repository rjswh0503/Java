package com.kh.pattern.mvc;
//mvc ������ �ƴ�x  Client ��¿�
import com.kh.pattern.mvc.controller.UserController;
import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserClient {

	public static void main(String[] args) {
		//�� ��ü ����
		UserModel user = new UserModel("ȫ�浿",20);
		
		
		//�� ��ü ����
		UserView view = new UserView();
		
		
		//��Ʈ�ѷ� ��ü ���� �� �� �� ����
		UserController controller = new UserController(user, view);
		
		
		//�л� ������ ������Ʈ�ؼ� ���
		
			
			
			
			

	}

}
