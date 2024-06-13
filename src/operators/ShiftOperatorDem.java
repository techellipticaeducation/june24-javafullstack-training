package operators;

public class ShiftOperatorDem {
public static void main(String[] args) {
	
	
	int i = 24;
	//11000
	//1100000
	
	System.out.println(i << 2);
	
	
	
	
	// you have to multiple a number by 2 - left shift
	// you have to devide a number by 2 - right shift
	// you cannot use * operator
	int k  = 10;
	// left shift operator
	
	k = k  >> 1;
	System.out.println(k);
}
}
