package operaciones;

public class Operation {
	protected final int operator1, operator2;
	
	public Operation(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }
    
    
    public int operacion (){
    	return 0;
    }
    @Override
    public String toString() {
        return "";
    }

}
