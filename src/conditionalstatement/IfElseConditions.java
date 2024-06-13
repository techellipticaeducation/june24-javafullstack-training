package conditionalstatement;

public class IfElseConditions {
public static void main(String[] args) {
	
	String ageGroup = "";
	int age = 32;
	
	// age < 18 = Child
	// age > 18 and age <= 30 = Adult
	// age > 30 and age <= 45 = Mature
	// old
	
	if(age <= 18) {
		ageGroup = "Child";
	}else if(age >18 && age <= 30){
		ageGroup = "Adult";
	}else if(age > 30 && age <= 45) {
		ageGroup = "Mature";
	}else {
		ageGroup = "Old";
	}
	
	System.out.println("Age Group is " + ageGroup);
	
}
}
