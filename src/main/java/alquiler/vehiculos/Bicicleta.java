package alquiler.vehiculos;

public class Bicicleta extends Vehiculo {
	private static final double precio1 = 3;
	private static final double precio2 = 2;
	
	public Bicicleta(String desc) {
		super(desc);
	}

	public double getPrecio(int dias){
		int restoDias = dias - 2;
		double precio = dias * Bicicleta.precio1;
		if( restoDias > 0) precio += (restoDias * Bicicleta.precio2);
		return precio;
	}
	
	public String toString(){
		return "Bici " + this.desc;		
	}

}
