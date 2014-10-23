package alquiler.vehiculos;

public class Bicicleta extends Vehiculo {
	private static final double precio1 = 3;
	private static final double precio2 = 2;
	
	public Bicicleta(String desc, String id) {
		super(desc, id);
	}

	public double getPrecio(int dias){
		int restoDias = dias - 2;
		double precio;
		if( restoDias > 0){
			precio = 2 * Bicicleta.precio1;
			precio += (restoDias * Bicicleta.precio2);
		}
		else precio = 2 * dias;
		return precio;
	}
	
	public String toString(){
		return "Bici " + this.desc;		
	}

}
