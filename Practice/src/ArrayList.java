import java.util.Scanner;

public class ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : " );
		int numRows = sc.nextInt();
		sc.nextLine();// 개행문자 제거
		
		
		int[][] charArray = new int[numRows][];
		
		for(int i = 0; i < numRows;i++) {
			System.out.print(i+ "열의 크기 받기 : ");
			int numCols = sc.nextInt();
			
			
			charArray[i] = new int[numCols];
			
			int StartValue = i *numCols + 1;
			for(int j = 0; j < numCols;j++) {
				charArray[i][j] = StartValue++;
			}
			
			
			}
				for(int i = 0; i < numRows;i++) {
					for(int j = 0; j < charArray.length;j++) {
						System.out.println((char)('a' + charArray[i][j]));
						
							
				}
					
					
				
						
			
			
		}
				
		
	}
	

}
