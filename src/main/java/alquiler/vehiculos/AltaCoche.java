package alquiler.vehiculos;

import upm.jbb.IO;

public class AltaCoche extends AltasController{
	
	
	public AltaCoche(VehiculoManager vm) {
		super(vm);
	}

	public void altaA(){
		A a = (A) IO.in.read(A.class, "Alta coche A");
		vm.altaVehiculo(a);
		
	}
	
	public void altaB(){
		B b = (B) IO.in.read(B.class, "Alta coche B");
		vm.altaVehiculo(b);			
	}
	
	public void altaC(){
		C c = (C) IO.in.read(C.class, "Alta coche C");
		vm.altaVehiculo(c);		
	}

}
