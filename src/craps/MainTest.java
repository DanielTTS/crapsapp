package craps;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void simpleAddDiceTest() {
		Integer result=new Main().addDice(1,6);
		assertEquals(7, result);
	}

	@Test
	void normalAddDiceTest() {
		Integer result=new Main().addDice(1,6);
		assertEquals(7, result);
	}
	@Test
	void edgeAddDiceTest() {
		Integer result=new Main().addDice(7,6);
		assertEquals(null, result);
	}
	@Test
	void simpleGameTest() {
		String result=new Main().playFirstTry(2);
		assertEquals("You Lose", result);
	}
	@Test
	void normalGameTest() {
		String result=new Main().playFirstTry(2);
		assertEquals("You Lose", result);
	}
	@Test
	void edgeGameTest() {
		String result=new Main().playFirstTry(13);
		assertEquals("Out Of Range", result);
	}

}
