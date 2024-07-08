package constructor;

public class SQLDBDemo {
	public static void main(String[] args) {
		
		System.out.println(SQLDB.i);
		SQLDB.getObject();
//		for(int i = 1;i <= 10;i++) {
//			SQLDB p1 = SQLDB.getObject();
//			p1.connectToDB();
//		}
	}
}
// Singleton Design Pattern
class SQLDB{
	static SQLDB object;
	private SQLDB() {
		System.out.println("Hello");
	}
	
	public static SQLDB getObject() {
		if(object == null) {
			object = new SQLDB();
		}
		return object;
	}
	static int i = 10;

	public void connectToDB() {
		System.out.println("Connection created by " + this);
	}
	
}
