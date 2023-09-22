package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer,String> todoMap = new HashMap<>();
		int tastNum = 1;
		
		
		Scanner sc = new Scanner(System.in);
		//할 일 목록
		
		while(true) {
			System.out.println("할 일 목록 :");
			for(Map.Entry<Integer, String> entry:todoMap.entrySet()) {
				System.out.println(entry.getKey() + " . " + entry.getValue());
			
			}
			System.out.println("=======================");
			System.out.println("할 일을 선택하세요.");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 제거");
			System.out.println("3. 종료");
			System.out.println("4. 할 일 목록");
			
			
				
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			
			switch(choice){
			case 1:
				
				System.out.println("추가 할 일을 작성해주세요.");
				String todoItem = sc.nextLine();
				todoMap.put(tastNum++, todoItem);
				System.out.println("할 일이 추가되었습니다.");
				break;
				
				
			case 2:
				System.out.println("제거할 일의 번호를 입력하세요.");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
					System.out.println("할 일이 제거되었습니다.");
					
				}else {
					System.out.println("번호를 잘못 입력 하셨습니다.");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.out.println("반가웠어요. 다음에 만나요");
				
				break;
			case 4:
				System.out.println("[할일 목록]");
				for(Map.Entry<Integer, String> entry:todoMap.entrySet()){
					System.out.println(entry.getKey() + " . " + entry.getValue());
				}
				break;
				
			default:
				System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
				sc.close();
				System.exit(0);
				break;
			
				
			}	
			
			
		}
	}

}
