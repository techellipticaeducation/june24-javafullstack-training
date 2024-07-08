package callbyrefval;

public class CallByValueDemo {

	public static void main(String[] args) {
		P1 p1 = new P1();
		p1.i = 40;
		changeValue(p1);
		System.out.println(p1.i); // 20 / 40
		
		
		// CALL BY VALUE - datatype (int ) - create a clone of entity 
		// and send to method 
		
		// CALL BY REF - object - actual ref will be redirected to mehtod call
	}	

	public static void changeValue(P1 p1) {
		p1.i = 20;
	}
}


class P1{
	int i ;
}

