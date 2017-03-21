import java.util.Scanner;

public class Bouncing_Ball {

	public static void main(String[] args) {
		
		
		System.out.print("Enter the initial velocity of the ball: ");
		Scanner kb = new Scanner(System.in);
		double velocity = kb.nextDouble();
		double  height = 0;
		int time = 0;
		int bounce = 0;
		
		System.out.println("Time: "+ time + " Height " + height);
		
		//while loop
		while(bounce <= 5){
			height = velocity + height;
			if (height < 0){
				height = height * (-0.5);
				velocity = velocity * (-0.5);
				time = time + 1;
				bounce = bounce + 1;
				System.out.println("Bounce !");
				System.out.println("Time: "+ time + " Height " + height);
			}
			else { //conditions where height is greater than zero
				velocity = velocity - 32;
				time = time + 1;
				System.out.println("Time: "+ time + " Height " + height);
			}
		}
	}

}
