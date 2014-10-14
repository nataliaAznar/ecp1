package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testVehiculoManager {
	VehiculoManager v ;
	
	@Before
	public void before() {
		v = new VehiculoManager();
		v.altaVehiculo(new Moto( "roja"));
	}
	
	@Test
	public void testVerVehiculos(){
		System.out.println(v.verVehiculos());
		assertEquals("Moto roja\n", v.verVehiculos());
		
	}
	
	@Test
	public void testGetPrecio(){
		assertEquals( 16.0, v.getPrecio(0, 2), 10e-5);
	}

}
