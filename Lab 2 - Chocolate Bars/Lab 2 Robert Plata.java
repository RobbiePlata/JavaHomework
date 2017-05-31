import java.util.Scanner;
public class Lab2Chocolate {

	public static void main(String[] args) {
		System.out.println("What is your age?");
		Scanner kb = new Scanner(System.in);
		double age = kb.nextDouble();
		System.out.println("What is your weight?");
		double weight = kb.nextDouble();
		System.out.println("What is your height?");
		double height = kb.nextDouble();
		System.out.println(height);
		double womanBMR = 655.1 + (4.35 * weight) + (4.7 * height) - (4.7*age);
		double manBMR = 66 + (6.2 * weight) + (12.7 * height) - (6.76*age);
		System.out.println("You would need to consume " + womanBMR/214 + " chocolate bars as a woman.");
		System.out.println("You would need to consume " + manBMR/214 + " chocolate bars as a man.");
	}

}