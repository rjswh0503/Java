package com.kh.ListArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		ListAndArray aa = new ListAndArray();
		aa.ListArray1();
		ListArray2();
	}
		public void ListArray1() { 
			//Array 예제    
			
			int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
			intArray[0]=1;
			intArray[1]=2;
			
			//intArray 출력
			System.out.println("Array 요소 : " );
			for(int a = 0; a < intArray.length;a++) {
				System.out.print(intArray[a] + " ");
			}
			
			
			System.out.println();//개행문자 포함돼있어 enter와 같은 역할을 함
			
			//List 예제					// 빈 배열 리스트 생성
			List<Integer> intList = new ArrayList<>();
										//Integer 객체를 저장하는 ArrayList 생성 
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			
			//List 출력
			System.out.println("List 요소 : " );
			for(int num : intList) {
				System.out.println(num + " ");
				
				
			}
			
			
		}
		public static  void ListArray2() {
			
			//String으로 변경 후 Array와 List 출력해보기
			
			 // Array 는 배열 추가나 삭제 불가능 
			String[] strArray = new String[2]; // 문자열 길이2 배열 생성
			strArray[0] = "강아지"; //index 0
			strArray[1] = "고양이"; //index 1
			
			System.out.println("Array 요소 : ");
			for(int i = 0; i <strArray.length;i++) {
				System.out.println(strArray[i] + " ");
				
			}
			System.out.println();
			
			List<String> StringList = new ArrayList<>(); // List는 배열 추가나 삭제 가능 
			StringList.add("강아지");
			StringList.add("고양이");
			StringList.add("사자");
			StringList.add("호랑이");
			StringList.add("늑대");
			
			System.out.println("List 요소 : ");
			for(String str : StringList) {
				System.out.println(str +" ");
			}
			
			System.out.println();
					
			
				}
	
		
			}		
		
		
	 
	
	
		
	
	
	

