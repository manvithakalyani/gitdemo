package test;

import org.testng.annotations.Test;

public class Ps1 extends Ps {
	
	@Test
	public void testRun() {
		 Ps2 ps = new Ps2(3);
		doThis();
		System.out.println(ps.increment());
		System.out.println(ps.decrement());
		
	}
}