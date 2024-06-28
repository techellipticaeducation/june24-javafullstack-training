package constructor;

public class ConstructorDemo {
public static void main(String[] args) {
	Bank b1 = new Bank("HDFC");
	System.out.println(b1.name);
	System.out.println(b1.interestRate);
}
}
 // 2 rules 
// constructor name always same as class name
// constructor do not return anything (do not mention any return type in constructor)

// Every class has a default constructor until we are not defining any explicit constructor
// one constructor can call another constructor only once.
// constructor calling should be the first statement in constructor
class Bank{
	String name;
	double interestRate;
	
	Bank(String name){
		this(name, 10);
		System.out.println("Hello");	
	}
	
	Bank(String name, double interestRate){
		this.name = name;
		this.interestRate = interestRate;	
	}
}
