package operators;

public class RelationalOperatorDemo {
public static void main(String[] args) {
	// Comparisons - return boolean
	
	int i = 10;
	int j = 6;
	
	System.out.println(!(i > j));  // true
	System.out.println(!(i >= j)); // true
	System.out.println(!(i < j));  // false
	System.out.println(!(i <= j)); // false
	System.out.println(!(i == j)); // false 
	System.out.println(!(i != j)); //  true
	
	
}
}
