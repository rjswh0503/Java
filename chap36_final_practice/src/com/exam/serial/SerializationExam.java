package com.exam.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.Permission;

import com.kh.finalSample.PersonMain;

public class SerializationExam {
	
	public static void main(String[] args) {
		PersonSerial p = new PersonSerial ("kh",30);
		
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
		
		
	}

}
