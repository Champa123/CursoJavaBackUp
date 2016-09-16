import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testSumar() {
		Calculadora2 calculadora = new Calculadora2();
		int total = calculadora.sumar(2, 4);
		assertEquals("deberia dar 6",6, total);
}

	@Test
	public void testRestar() {
		Calculadora2 calculadora = new Calculadora2();
		int total = calculadora.restar(4, 4);
		assertEquals("deberia dar 0",0, total);

	}

}
