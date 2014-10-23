package alquiler.vehiculos;

public class Vehiculo {
	protected String desc;
	protected String id;
	
	public Vehiculo( String desc, String id){
		this.desc = desc;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public double getPrecio(int dias){
		return 0.0;
	}
	
	public String toString(){
		return "";		
	}

}
