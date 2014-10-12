package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testVehiculoManager {
	VehiculoManager v ;
	
	@Before
	public void before() {
		v = new VehiculoManager();
	}
	
	@Test
	public void testVerVehiculos(){
		v.altaVehiculo(new Moto());
		assertEquals("Moto 0", v.verVehiculos());
		
	}
	
	@Test
	public void testGetPrecio(){
		v.altaVehiculo(new Moto());
		assertEquals( 24.0, v.getPrecio(0, 2), 10e-5);
	}

}
