package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {

	@Test
	public void test() {
		AddingMachine calculator = new AddingMachine(); 
		calculator.add(5);
		assertEquals(calculator.getTotal(), 5);
		
		calculator.subtract(2);
		assertEquals(calculator.getTotal(), 3);

		calculator.add(6);
		assertEquals(calculator.getTotal(), 9);
		
		assertEquals("0 + 5 - 2 + 6", calculator.toString());
	}

}
