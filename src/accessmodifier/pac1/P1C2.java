package accessmodifier.pac1;

public class P1C2 {
	private static void m1() {

	}
	public static void callm1() {
		m1();
	}
}

// Access Modifier - visibility/ access of entity
// everywhere
// package level
// class level

// public  - is visible everywhere
// protected - with in package + if class inherting in another 
// default -   with in package
// private -   with in class

// public > protected >  default > private
// class - public > default 
// variable - public > protected >  default > private
// method - public > protected >  default > private
// constructors - public > protected >  default > private



