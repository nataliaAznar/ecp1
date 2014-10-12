package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testVehiculo {
	Vehiculo v;
	
	@Before
	public void before() {
		v = new Bicicleta("azul");
	}
	
	@Test
	public void testGetPrecio(){
		assertEquals(8.0, v.getPrecio(3), 10e-5);
	}
	
	@Test
	public void testToString(){
		assertEquals("Bici azul", v.toString());
	}

}
