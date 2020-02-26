import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterest {

	@Test
	public void test() {
		simpleandcompound S=new simpleandcompound();
		assertEquals(500.0,S.simpleInterest(5, 1, 10000),0);
	}

}
