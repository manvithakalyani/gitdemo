package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Ps {
	public void doThis() {
		System.out.println("test");
		
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}

}
