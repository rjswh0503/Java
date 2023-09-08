package com.kh.mvc.circle.co;

import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleMain {

	public static void main(String[] args) {
		
		CircleModel model = new CircleModel();
		CircleView view = new CircleView();
		CircleController controller = new CircleController(model, view);
		
		controller.run();
		
		
		
		
		
		

	}

}
