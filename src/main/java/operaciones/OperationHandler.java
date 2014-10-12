package operaciones;

public class OperationHandler {
	private Operation[] operators = new Operation[10];
	
	public void add(Operation operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;
                return;
            }
        }
        return;
    }
	
	public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }
	
	 public int total() {
		 int result = 0;
		 for (int i = 0; i < operators.length; i++) {
			 if (operators[i] != null) 
				 result += operators[i].operacion();
			else
				i = operators.length;
		 }
		 return result;
	 }
	
}
