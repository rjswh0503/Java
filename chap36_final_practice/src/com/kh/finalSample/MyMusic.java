package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
public static void main(String[] args) {
	MyMusic m = new MyMusic();
	m.runMusic();
	
}
	public void runMusic() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��","����"));
		list.add(new Music("����","�ų�"));

		for(int i =0; i <= list.size(); i++) {
			Music m = list.get(i);
			System.out.println(m.getN() + m.getG());
		}
	}
}
