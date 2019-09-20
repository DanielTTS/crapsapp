package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class MainTest {

	@Test
	void test() {
		Integer result = new Main().add(2, 7);
	
		assertEquals(9, result);
	}
	void multiTest() {
		Integer result = new Main().multi(12, 3);
				assertEquals(36, result);
	}
	void divTest() {
		Integer result = new Main().div(120, 10);
		assertEquals(12, result);
	}
	

}
