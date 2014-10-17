package alquiler.vehiculos;

import upm.jbb.IO;

public class VehiculoController extends Controller{
	
	public VehiculoController(){
		this.vm = new VehiculoManager();
	}
	
	public void altaVehiculo(){
		AltaController alta = new AltaController(this.vm);
		IO.in.addController(alta);
	}
	
	public void verVehiculos(){
		
	}
	
	public void getPrecio (int id, int dias){

	}

}
