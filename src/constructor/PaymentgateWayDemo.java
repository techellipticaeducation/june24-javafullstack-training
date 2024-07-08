package constructor;

public class PaymentgateWayDemo {
	public static void main(String[] args) {
		for(int i = 1;i <= 10;i++) {
			PaymentGateWay p1 = new PaymentGateWay();
			System.out.println(p1);
		}
	}
}

// Singleton Design Pattern
// i would like to restrict my object creation in my class.

class PaymentGateWay{

}
