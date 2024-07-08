package inheritance;

public class A {
	public void m1() {
		
	}

}
class B extends A{
	public void m2() {
		
	}
}
class C extends B{
	public void m3() {
		m2();
		m1();
	}
}

class Test45{
	public static void main(String[] args) {
		C c1 = new C();
		
		// Object class is the parent of all the class
	}
}

// Bank
// Indian Bank  US Bank , UK Bnk
// Indian - SBI, IndianBank, PNB
// USBank - Citibank, 
// UK Bank = Barclays



