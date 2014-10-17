package alquiler.vehiculos;

import upm.jbb.IO;

public class AltaController extends AltasController{
	
	public AltaController(VehiculoManager vm) {
		super(vm);
	}

	public void altaCoche(){
		AltaCoche alta = new AltaCoche(this.vm);
		IO.in.addController(alta);
	}
	
	public void altaMoto(){
		Moto m = (Moto) IO.in.read(Moto.class, "Alta moto");
		vm.altaVehiculo(m);
	}

	public void altaBici(){
		Bicicleta b = (Bicicleta) IO.in.read(Bicicleta.class, "Alta bici");
		vm.altaVehiculo(b);
	}
	

}
