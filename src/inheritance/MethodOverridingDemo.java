package inheritance;

public class MethodOverridingDemo {
public static void main(String[] args) {
	H2 h2  = new H2();
	h2.m1();
}
}

//  child class simply override the parent class
// method overriding

// access modifier rule , public > protected > default > private
// child class method cannot reduce visibility of parent class overriding method

// super keyword rule

// private - no visibility and final rule 
// final - if we are using final with a method, then , child class cannot override it

// final keyword with a class, we cannot inherit that class
// final classes cannot have IS-A Relationship
// final classes can have HAS-A Relationship only

// return type rule

// Exception Rule
class H1{
	 public void m1() {
		System.out.println("H1-m1 implementation");
	}	
}

class H2 extends H1{
	public void m1() {
		System.out.println("H2-m1 implementation");		
	}
}
