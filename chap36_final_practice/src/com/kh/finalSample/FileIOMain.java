package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	
	public static void main(String[] arsg ) {
		
		try {
			
			FileWriter fw = null;
			
									// 2��° ������ ���� boolean true�����Ǹ� �ش� ���Ͽ� �̾��
			fw = new FileWriter("file.txt",true);
			fw.write(1000);
			fw.write(10000);
			fw.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}

