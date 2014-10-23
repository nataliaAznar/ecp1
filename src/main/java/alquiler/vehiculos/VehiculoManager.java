package alquiler.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Iterator;

import upm.jbb.IO;

public class VehiculoManager {
	private Map<String,Vehiculo> listaVehiculo = new HashMap<String,Vehiculo>();
	
	public void altaVehiculo( Vehiculo v){
		this.listaVehiculo.put(v.getId(), v);
	}
	
	public String verVehiculos(){
		String vehiculos = "";
		
		Iterator it = listaVehiculo.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			vehiculos = vehiculos + e.getValue().toString()+ '\n' ;
		}
		
		return vehiculos;
	}
	
	public double getPrecio (String id, int dias){
		Vehiculo v = this.listaVehiculo.get(id);
		return v.getPrecio(dias);
	}

}
