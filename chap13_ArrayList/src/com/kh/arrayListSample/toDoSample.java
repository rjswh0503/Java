package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		
		ArrayList<String> toDo = new ArrayList();
		
		
		
		
		toDo.add("복습 하기");
		System.out.println("할일1개 추가 : " + toDo);
		toDo.add("게임 하기");
		System.out.println("할일2 추가 : " + toDo);
		toDo.add("밥 먹기");
		System.out.println("할일3 추가 : " + toDo);
		
		int size = toDo.size();
		System.out.println("할일 갯수 :" + size);
		
		
		toDo.set(1, "코딩 연습하기");
		System.out.println("수정체크 : " + toDo);
		toDo.set(2, "잠자기");
		System.out.println("수정체크 : " + toDo);
		
		
		
		
		toDo.remove(0);
		System.out.println("복습하기 제거 확인 : " + toDo);
		
		
		
		for(String adadada:toDo) {
			System.out.println("할일 목록 : " + adadada);
		}
		
		
		//중복된 할일 제거
	
		//ArrayList 제거 
		
		toDo.clear();
		System.out.println("모든 할일 제거 : " + toDo);
		
		
		
	}

}
