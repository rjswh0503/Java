package com.kh.calculatorMVC;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;	
	}
	
	
	public void run() {
		int userInput = view.getUserInput();
		model.setnumber(userInput);
		int result = model.calculatorSquare();
		System.out.println("°á°ú : " + result);
	}

}
