package methods;

public class ObjectOrientationDemo {
	static Bank b1;
	public static void main(String[] args) {
		b1.interestRate = 2.5d;
		double d1 = b1.getInterest(10.0d, 3);
		System.out.println(d1);
	}
}


class Bank{
	String name ;
	double interestRate;
	
	public double getInterest(double pricipalAmount, int time) {
		double interest = (pricipalAmount * time * interestRate)/100;
		return interest;
	}
	
}
