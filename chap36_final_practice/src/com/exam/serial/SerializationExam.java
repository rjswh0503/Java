package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Permission;

import com.kh.finalSample.PersonMain;

public class SerializationExam {
	
	public static void main(String[] args) {
		PersonSerial p = new PersonSerial ("kh",30);
		//��ü�� ����ȭ�Ͽ� ���Ͽ� ����
		
	try{
		FileOutputStream fileOut = new FileOutputStream("person.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(p);
		out.close();
		fileOut.close();
		
		// Person deSerialPerson = (Person) out.read
	} catch(Exception e) {
		
		e.printStackTrace();
	}
		//���Ͽ��� ��ü�� ������ȭ �Ͽ� �о��
		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("person.txt ���Ͽ��� ��ü�� ������ȭ�Ͽ����ϴ�.");
			System.out.println("������ȭ�� ��ü ���� :" + );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
