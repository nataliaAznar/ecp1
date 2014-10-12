package alquiler.vehiculos;

public class Moto extends Vehiculo {
	private static final double precio1 = 8;
	private static final double precio2 = 7;
	
	public Moto(String desc) {
		super(desc);
	}

	public double getPrecio(int dias){
		int restoDias = dias - 2;
		double precio;
		if ( restoDias > 0 ) precio = Moto.precio2 * dias;
		else precio = Moto.precio1 * dias;
		return precio;
	}
	
	public String toString(){
		return "Moto " + this.desc;		
	}

}
