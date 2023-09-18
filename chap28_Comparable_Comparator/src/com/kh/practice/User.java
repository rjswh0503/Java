package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String>  {

	
	
	
	
	
	public int compare(String user1, String user2) {
		
		if(user1.length() == user2.length()) {
			return 0;
		}
		else if(user1.length() > user2.length()) {
			return 1;
			
		}
		else {
			return -1;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<String> user = new ArrayList<>();
		
		user.add("kim123");
		user.add("lee123");
		user.add("min123456");
		user.add("no45624321");
		user.add("Oi213454");
		
		
		Collections.sort(user, new User());
		
		for(String u : user) {
			System.out.println("User :" +u);
		}
				
		
		
		
		
		
		//List ArrayList 생성 Comparator 정리 
		

	}

}
