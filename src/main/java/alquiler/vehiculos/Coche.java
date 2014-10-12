package alquiler.vehiculos;

public class Coche extends Vehiculo {
	protected static final double tarifa2 = 0.80;
	protected static final double tarifa3 = 0.50;

	public Coche(String desc) {
		super(desc);
	}
	
	protected int tarifaUno ( int dias){
		if ( dias > 3) return 3;
		else return dias;
	}
	
	protected int tarifaDos ( int dias){
		if (dias > 7) return 4;
		else if (tarifaUno(dias) != dias)
			return dias - 3;
		else return 0;
	}
	
	protected int tarifaTres ( int dias){
		if ( dias > 7) return dias - 7;
		else return 0;
	}
	

}
