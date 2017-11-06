package com.qph.garbagecollection;

public class TestGarbage1 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		TestGarbage1 s1 = new TestGarbage1();
		TestGarbage1 s2 = new TestGarbage1();
		s1 = s2;
		// s2=null;
		System.gc();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
