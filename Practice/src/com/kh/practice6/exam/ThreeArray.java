package com.kh.practice6.exam;

public class ThreeArray {
	public static void main(String[] args) {
		String[][] str = {
				//열
				{"빨간색","주황색","노란색"},	//첫 번째 행 인덱스 0
				{"초록색","파란색","남색"}, // 두 번째 행 인덱스 1
				{"보라색","검은색","핑크색"} // 세 번째 행 인덱스 2
				
				//i = 행  
				//j = 열
		
		};
		
		for(int i = 0; i < str.length;i++) { // 외부 반복문은 행을 순회한다.
			for(int j = 0; j < str.length; j++) { // 내부 반복문은 열을 순회한다.
				System.out.print(str[i][j] + " "); //출력 메소드 
		
		
			}
			System.out.println(); 
			
			
			
		}
		

	
				
				
				
				
				
				
				
				
				
				
	
		}				
}
