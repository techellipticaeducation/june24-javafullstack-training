package operators;

public class BitwiseOperator {
	public static void main(String[] args) {
		// And  Or

		// What is And ? 
		// true & true = true
		// true & false = false
		// false & true = false
		// false & false = false

		// What is Or?
		// true | true = true
		// true | false = true
		// false | true = true
		// false | false = false
		
		// Logical Operator 
		System.out.println(TRUE() || TRUE());
	}
	
	public static boolean TRUE() {
		System.out.print("1");
		return true;
	}
	public static boolean FALSE() {
		System.out.print("0");
		return false;
	}
	
	
}
