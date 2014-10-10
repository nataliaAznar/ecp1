package operaciones;

public class Summation extends Operation{

	public Summation(int operator1, int operator2) {
		super(operator1, operator2);
	}
	
	@Override
	public int operacion() {
        return this.operator1 + this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "+" + operator2 + "]";
    }
	

}
