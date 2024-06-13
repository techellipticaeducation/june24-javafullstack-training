package conditionalstatement;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("Enter a number");
		int i = scan.nextInt();
		System.out.println("You entered " + i);
	}
}
}
