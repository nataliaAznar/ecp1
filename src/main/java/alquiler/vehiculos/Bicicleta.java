package alquiler.vehiculos;

public class Bicicleta extends Vehiculo {
	
	public Bicicleta(String desc) {
		super(desc);
	}

	public double getPrecio(int dias){
		return 8;
	}
	
	public String toString(){
		return "Bici azul";		
	}

}
