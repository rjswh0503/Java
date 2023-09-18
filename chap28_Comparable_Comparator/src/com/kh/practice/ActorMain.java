package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActorMain {

	public static void main(String[] args) {
		List<Actor> Actors = new ArrayList<>();
		Actors.add(new Actor("배우1",27));
		Actors.add(new Actor("배우2",24));
		Actors.add(new Actor("배우3",30));
		
		//나이를 기준으로 정렬
		Collections.sort(Actors);
		for(Actor act:Actors) {
			System.out.println(act);
		}

	}

}
