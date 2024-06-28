package methods;

public class MethodDemo {
	public static void main(String[] args) {
		// service
		//   input ->  method -> output
		Calculator c1 = new Calculator();
		int z = c1.add(10, 20);
		c1.add(12.3d, 45);
		System.out.println(z);
		double pi = c1.valueOfPi();
		System.out.println(pi);
		c1.print("Hello ti siasdljasdlf");
		
		Calculator.add(10, 20);
	}
}
// return type - no role in method overloading
class Calculator{

	{
		
	}
	
	static{
		
	}
	
	static int add(int a, int b, int c){
		int d = a + b + c;
		return d;
	}
	static int add(int a, int b){
		int c = a + b;
		return c;
	}
	
	
	static int add(double a, int b){
		int c = (int)a + b;
		return c;
	}
	// non parameterized method
	double valueOfPi() {
		return 3.14d;
	}
	
	void print(String content) {
		System.out.println(content);
	}
	
}