package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;


public class Day4 {
	    @Test(groups="web")
		public void WebloginCarLone() {
			System.out.println("WebloginCarLone");
			
		}
		@Test
		public void MobileloginCarLone1() {
			System.out.println("MoblieloginCarLone1");
			
		}
		@Test(enabled=false)
		public void MobileloginCarLone() {
			System.out.println("MoblieloginCarLone");
			
		}
		@Test
		public void TabloginCarLone() {
			System.out.println("TabloginCarLone");
			
		}
		@Parameters({"URL"})
		@Test
		public void TabloginCarLone1(String urlName) {
			System.out.println("TabloginCarLone1");
			System.out.println(urlName);
			
		}
		 @BeforeMethod
		    public void beforeMethod() {
		        System.out.println("Before Method");
		    }

		    @Test
		    public void testMethod1() {
		        System.out.println("Test Method 1");
		    }

		    @Test
		    public void testMethod2() {
		        System.out.println("Test Method 2");
		    }

		    @AfterMethod
		    public void afterMethod() {
		        System.out.println("After Method");
		    }

				}


