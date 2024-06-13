package operators;

public class TernaryOperatorDemo {
	public static void main(String[] args) {

		int age = 20;
		String ageGroup = age < 18 ? "Child" : "Adult" ;

		// age < 18 = Child
		// age >= 18 = adult;

		System.out.println(ageGroup);

	}
}
