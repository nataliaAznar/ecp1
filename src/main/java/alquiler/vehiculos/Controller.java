package alquiler.vehiculos;

import upm.jbb.IO;

public class Controller  extends ControllerP{
	
	public Controller() {
		this.vm = new VehiculoManager();
	}
	
	public void altaVehiculo(){
		AltaController alta = new AltaController(this.vm);
		IO.in.addController(alta);
	}
	
	public void verVehiculos(){
		IO.out.print(vm.verVehiculos());
	}
	
	public void getPrecio (){
		int dias = IO.in.readInt("Introduzca los días");
		String id = IO.in.readString("Introduzca el id");
		IO.out.print(vm.getPrecio(id, dias));
	}

}
