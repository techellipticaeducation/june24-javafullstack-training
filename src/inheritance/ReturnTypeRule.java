package inheritance;

import java.util.ArrayList;
import java.util.List;

public class ReturnTypeRule {

}

class W1{
	
}
class W2 extends W1{
	
}


class K1{
	public ArrayList m1() {
		return null;
	}
}

class K2 extends K1{
	public List m1() {
		return null;
	}
}