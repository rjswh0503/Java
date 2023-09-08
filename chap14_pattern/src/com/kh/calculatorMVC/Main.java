package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		//model = CalculatorModel
		
		CalculatorModel model = new CalculatorModel();
		
		
		
		//view = CalculatorView
		CalculatorView view = new CalculatorView();
		
		
		//controller = CalculatorController
		CalculatorController controller = new CalculatorController(model, view);
		
		
		controller.run();
		
		
		
		

	}

}
