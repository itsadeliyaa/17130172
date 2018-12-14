import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositCalculatorTest {

	@Test
	void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(45000.0 , 20.0, 3);
		assertEquals(69165, result);
	}
	
	@Test
	void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(60000.0 , 5.0, 4);
		assertEquals(72000, result);
	}
	
}
