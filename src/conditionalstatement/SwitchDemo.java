package conditionalstatement;

public class SwitchDemo {
	public static void main(String[] args) {
		int dayNumber = 66;
		String dayName = "";
		
		switch(dayNumber) {
		case 1:
		case 8:
			dayName = "Monday";
			break;
		case 2:
		case 9:
			dayName = "Tuesday";
			break;
		case 3:
		case 10:
			dayName = "Wednesday";
			break;
		case 4:
		case 11:
			dayName = "Thursday";
			break;
		case 5:
		case 12:
			dayName = "Friday";
			break;
		case 6:
		case 13:
			dayName = "Saturday";
			break;
		case 7:
		case 14:
			dayName = "Sunday";
			break;
		default:
			dayName = "No Value found";
		}
		System.out.println(dayName);
		// switch only works with equality
	}
}
