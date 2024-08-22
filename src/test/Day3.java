package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void WebloginHomeLone() {
		System.out.println("WebloginHomeLone");
		
	}
	@Test
	public void MobileloginHomeLone() {
		System.out.println("WebloginHomeLone");
		
	}
	@Test
	public void APIloginHomeLone() {
		System.out.println("loginHomeLone");
		
	}
	@BeforeTest
	public void APIloginpreRequest() {
		System.out.println("I am first");
		
	}

}
