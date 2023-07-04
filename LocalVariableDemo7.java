
public class LocalVariableDemo7 {

	public void methodone() {
		int j = 25; // <---------- local variable
		System.out.println("Value of j:" + j);
	}

	public void methodtwo() {
		int k = 30; // <---------- local variable
		System.out.println("Value of k:" + k);
		// System.out.println("Value of j:" + j); // ← Error
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariableDemo7 var = new LocalVariableDemo7();
		var.methodone();
		var.methodtwo();
	}
}
