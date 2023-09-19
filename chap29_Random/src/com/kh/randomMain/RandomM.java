package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomM {

	public static void main(String[] args) {
		RandomM rdm = new RandomM();
		rdm.Lotto();
	

	}
	public void Lotto() {
		Random rd = new Random();
		
		
		List<Integer> lottoNum = new ArrayList<>();
		
		
		int six = 6;
		
		while(lottoNum.size() < six) {
			int ranNumber = rd.nextInt(45)+1;
			
			
			if(!lottoNum.contains(ranNumber)) {
				lottoNum.add(ranNumber);
			}
			
		}
		System.out.println("로또 번호 : " +lottoNum);
	}

}
