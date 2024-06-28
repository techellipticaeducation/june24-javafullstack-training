package methods;

public class Test34 {

	// in order to execute your code , 
	//	we must have main method in class
	//  execution starts from static block
	//	if static block is not available
	//	then main method will static execute
	
	// 1 - static variables and static blocks
	// 2 - static method
	// 3 - instance variables and instance blocks
	// 4 - non-static methods
	
	
	static Test34 t1 ;
	static int i = 10;
	static int m1;
	int j = 10;
	{
		System.out.println(j);	
		System.out.println(i);		
	}
	static {
		System.out.println(i);	
		m1 = 10;
		t1 = new Test34();
		System.out.println(t1.j);
	}
	public void m1() {
		System.out.println(j);	
		System.out.println(i);	
	}
	
	public static void main(String[] args) {
		System.out.println(m1);
		System.out.println("C");
		System.out.println(i);	
		System.out.println(t1.j);	
	}
	
}
