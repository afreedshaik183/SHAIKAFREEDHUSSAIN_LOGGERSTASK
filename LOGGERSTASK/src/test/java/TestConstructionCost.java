import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructionCost {

	@Test
	public void test() {
		ConstructionCost C=new ConstructionCost();
		assertEquals(100000.0,C.Cost("HighStandardMaterialsAndFullAutomatedHome", 4),0);
	}

}
