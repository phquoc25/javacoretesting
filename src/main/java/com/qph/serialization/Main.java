package com.qph.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student std = new Student();
		std.setId(123);
		std.setName("Quoc PHAN");
		
		Student std1 = new Student();
		std.setId(456);
		std.setName("Quoc PHAN");
		
		
		
	}

	private static Object deserializeObj(String fileName) {
		Object returnedObj = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(fileName);
			objectInputStream = new ObjectInputStream(fileInputStream);
			returnedObj = objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return returnedObj;
	}

	private static void serializeObj(Object std, String fileName) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		//Serialization
		try {
			fileOutputStream = new FileOutputStream("serialized_student");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(std);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fileOutputStream != null){
					fileOutputStream.close();
				}
				if(objectOutputStream != null){
					objectOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
