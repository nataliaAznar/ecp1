package alquiler.vehiculos;

import upm.jbb.IO;

public class VehiculoMain {
	
	public static void main(String[] args) {
		Controller c = new Controller();
		IO.in.addController(c);	
	}

}
