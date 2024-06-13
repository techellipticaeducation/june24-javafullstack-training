package conditionalstatement;

public class DayNumberDemo {
	public static void main(String[] args) {
		int dayNumber = 10;
		String dayName = "";
		if(dayNumber == 1 || dayNumber == 8) {
			dayName = "Monday";
		}else if(dayNumber == 2 || dayNumber == 9) {
			dayName = "Tuesday";
		}else if(dayNumber == 3 || dayNumber == 10) {
			dayName = "Wednesday";
		}else if(dayNumber == 3 || dayNumber == 11) {
			dayName = "Thursday";
		}else if(dayNumber == 5 || dayNumber == 12) {
			dayName = "Friday";
		}else if(dayNumber == 6 || dayNumber == 13) {
			dayName = "Saturday";
		}else if(dayNumber == 7 || dayNumber == 14) {
			dayName = "Sunday";
		}
		System.out.println(dayNumber + " - " + dayName);
	}
}
