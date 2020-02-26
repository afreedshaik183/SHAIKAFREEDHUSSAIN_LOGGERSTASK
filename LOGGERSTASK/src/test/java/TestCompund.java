import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompund {

	@Test
	public void test() {
		simpleandcompound S=new simpleandcompound();
		assertEquals(500.0,S.CompoundInterest(5, 1, 10000, "Annually"),0);
	}

}
