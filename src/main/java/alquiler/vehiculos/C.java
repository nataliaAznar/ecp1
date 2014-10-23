package alquiler.vehiculos;

public class C extends Coche {
	private static final double precio = 20;
	
	public C(String desc, String id) {
		super(desc, id);
	}

	public double getPrecio(int dias){
		double precioFinal;
		int diasTarifaUno = this.tarifaUno(dias);
		precioFinal = diasTarifaUno * C.precio;
		precioFinal += this.tarifaDos(dias) * C.precio * C.tarifa2;
		precioFinal += this.tarifaTres(dias) * C.precio * C.tarifa3;
		return precioFinal;
	}
	
	public String toString(){
		return "Coche C " + this.desc;
	}

}
