package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActorMain {

	public static void main(String[] args) {
		List<Actor> Actors = new ArrayList<>();
		Actors.add(new Actor("���1",27));
		Actors.add(new Actor("���2",24));
		Actors.add(new Actor("���3",30));
		
		//���̸� �������� ����
		Collections.sort(Actors);
		for(Actor act:Actors) {
			System.out.println(act);
		}

	}

}
