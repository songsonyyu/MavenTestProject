package com.sdet;

import org.testng.TestNG;

public class TestRunner {
	static TestNG testNg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {AppTest.class, TC_Login.class});
		testNg.run();;
	}

}
