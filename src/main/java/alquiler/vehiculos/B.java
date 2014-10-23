package alquiler.vehiculos;

public class B extends Coche {
	private static final double precio = 15;
	
	public B(String desc, String id) {
		super(desc, id);
	}

	public double getPrecio(int dias){
		double precioFinal;
		int diasTarifaUno = this.tarifaUno(dias);
		precioFinal = diasTarifaUno * B.precio;
		precioFinal += this.tarifaDos(dias) * B.precio * B.tarifa2;
		precioFinal += this.tarifaTres(dias) * B.precio * B.tarifa3;
		return precioFinal;
	}
	
	public String toString(){
		return "Coche B " + this.desc;
	}

}
