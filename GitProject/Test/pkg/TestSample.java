package pkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSample {

	@Test
	public void test1() {
		
		sample sam = new sample();
		String ret = sam.method1();
		
		assertEquals("",ret);
	}
	
}
