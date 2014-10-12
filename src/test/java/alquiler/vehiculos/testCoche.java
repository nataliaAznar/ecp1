package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testCoche {
	Coche c;
	
	@Before
	public void before() {
		c = new A();
	}
	
	@Test
	public void testGetPrecio(){
		assertEquals(67.0, c.getPrecio(9), 10e-5);
	}
	
	@Test
	public void testToString(){
		assertEquals("Coche A 0", c.toString());
	}
}
