
public class FormatterMain {
	
	/*
	Formatter 문자열을 형식화 하는데 사용되는 클래스 텍스트 출력을 
	원하는 형식에 맞게 포맷팅하고 싶을 때 유용하게 사용 
	  
	  
	  */

	public static void main(String[] args) {
		String name = "kim";
		int age = 30;
		double salary = 50000.50;
		
		//Formatter 사용하여 문자열을 형식화
		//2. 소수점 이하 자릿수를 지정하는데 사용 소수점 이하 두자리까지 출력
		String formatString = String.format("이름 : %s, 나이: %d, 월급: %.2f", name,age,salary);
		
		//형식화된 문자열을 출력 
		System.out.print(formatString);
	}

}
