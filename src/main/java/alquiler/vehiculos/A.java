package alquiler.vehiculos;

public class A extends Coche {
	private static final double precio = 10;
	
	public A(String desc) {
		super(desc);
	}

	public double getPrecio(int dias){
		double precioFinal;
		int diasTarifaUno = this.tarifaUno(dias);
		precioFinal = diasTarifaUno * A.precio;
		precioFinal += this.tarifaDos(dias) * A.precio * A.tarifa2;
		precioFinal += this.tarifaTres(dias) * A.precio * A.tarifa3;
		return precioFinal;
	}
	
	public String toString(){
		return "Coche A " + this.desc;		
	}

}
