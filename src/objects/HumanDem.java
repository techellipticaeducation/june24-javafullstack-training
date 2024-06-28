package objects;

public class HumanDem {
	public static void main(String[] args) {
//		Human h1 = new Human();
//		h1.name = "name1";
//		h1.age = 23;
//		h1.country = "India";
//		
		Human h2 = new Human();
		h2.name = "name2";
		h2.age = 24;
		h2.country = "Australia";
//		
//		System.out.println(h1.name);   // 
//		System.out.println(h2.age);
//		System.out.println(h2.country); // Australia
//		System.out.println(h1.country);  // India
		
		// static variable always load when class load
		// instance variable always load when object creation
		
		// static variable we can call as class variable
		// static variables we cannot create inside methods
		Human.country = "Pakistan";
		System.out.println(h2.country);
		
	}
}

class Human{
	static String name = "Test1";
	int age; //instance
	static String country;
	
	void speak() {
		String name = "Test2" ; // local variable
		System.out.println(name);
		
		System.out.println(Human.name);
		
		// variable shadowing - local variable and
		// instacne varibale if
		// name is same then local shadow instance
		
	}
	
	
}
