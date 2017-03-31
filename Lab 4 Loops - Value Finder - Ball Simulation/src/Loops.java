import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
	Scanner kb = new Scanner(System.in);
	System.out.print("Type an integer for the size of your triangle");
	int size = kb.nextInt();
	
	for (int x = 1; x <= 2 * size; x += 1) {
	    int stars;
	    if (x <= size) { //count larger than size
	        stars = x; //value set to count
	    }
	    else{
	        stars = 2 * size - x; //2s - count
	    }
	    for (int j = 0; j < stars; j++) {
	        System.out.print("*");
	    }
	    System.out.println();
}
	}
}
