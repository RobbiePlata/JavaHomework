import java.util.Scanner;
public class Dates {

	public static void main(String[] args) {
		//keyboard 
		Scanner kb = new Scanner(System.in);
		System.out.println("Type a date with the format ");
		
		//Strings
		String date = kb.nextLine();
		String month = date.substring(0,2);
		String day = date.substring(3,5);
		String year = date.substring(6,10);
		
		//String Verification
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Year: " + year);
		
		//String to integer
		int intMonth = Integer.parseInt(month);
		int intDay = Integer.parseInt(day);
		int intYear = Integer.parseInt(year);
		
		boolean validate = true;
		if (intDay == 0 || intMonth == 0){
			System.out.println("You cannot have 0 for a month or day.");
			validate = false;
		}
		//January
		if (intMonth == 1){
			if (intDay > 31 || intDay < 0){
				validate = false;
			}
		}
		//February
		else if (intMonth == 2){
			if (intDay > 29 || intDay < 0){
				validate = false;
			}
			else if (intDay < 30){
				if (intDay == 29){
					if (intYear % 4 == 0){
						if (intYear % 100 != 0){
							System.out.println(intYear + " is a leap year");
						}
						else if (intYear % 400 == 0){
							System.out.println(intYear + " is a leap year");
							validate = true;
						}
					else{
						validate = false;
						System.out.println("Date not valid.");
						}
					}
					else{
						validate = false;
						System.out.println("Day is too large for February of this year.");
					}
				}
			}
			else{
				validate = true;
			}
		}
		//March
		else if (intMonth == 3){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		//April
		else if (intMonth == 4){
			if (intDay>30 || intDay < 0){
				validate = false;
			}
		}
		//May
		else if (intMonth == 5){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		//June
		else if (intMonth == 6){
			if (intDay>30 || intDay < 0){
				validate = false;
			}
		}
		//July
		else if (intMonth == 7){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		//August
		else if (intMonth == 8){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		//September
		else if (intMonth == 9){
			if (intDay>30 || intDay < 0){
				validate = false;
			}
		}
		//October
		else if (intMonth == 10){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		//November
		else if (intMonth == 11){
			if (intDay>30 || intDay < 0){
				validate = false;
		//December
			}
		}
		else if (intMonth == 12){
			if (intDay>31 || intDay < 0){
				validate = false;
			}
		}
		System.out.println("\nDate is " + validate);
	}
}
