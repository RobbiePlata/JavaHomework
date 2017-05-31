/* Robert Cyril Plata III
 * Professor Edward Crotty
 * Math Concepts in Computing 
 * Project # 4 Godel's Undecidability Theorem
 * VERSION 2
 */

import java.util.Scanner;
public class Theorem {

	public int number = 0;
	public int num1;
	public int num2;
	public String zero = "0";
	public String successor = "f";
	public String not = "¬";
	public String or = "V";
	public String forAll = " ForAll ";
	public String leftParenthesis = "(";
	public String rightParenthesis = ")";
	public String and = "And";
	public String thereExists = " ThereExists ";
	public String equals = " = ";	
	public char[] godelInput; // The users input, for example:  " 2^3*3^4*5^7*7^11 "
	public String[] userPrimes; // The primes of what the user inputed
	public String[] userExponents; // The userExponents of the primes from godelInput
	
	Scanner kb = new Scanner(System.in);
	
	public int getNum(){
		boolean go = true;
		while(go){
			System.out.println("Enter an even number: ");
			int num = kb.nextInt();
			if(num >= 2 && num % 2 == 0){
				go = false;
			}
			this.number = num;
		}
		return number;
	}
	public void setNum(int number){
		this.number = number;
	}
	
	//Checks if a number is Prime
	boolean isPrime(int num) {
	    for(int i = 2; i < Math.sqrt(num); i++) {
	        if(num % i == 0)
	            return false;
	    }
	    return true;
	}
	
	// Finds two primes adding to sum
	public void calculation(int num){
		System.out.println("Combinations of Primes adding to " + num);
		for(int i = 2; i < num; i ++){
			for(int j = 2; j < num; j ++){
				if(isPrime(i) == true){
					if(isPrime(j) == true){
						if(num == 4){
							System.out.println("2 + 2 = 4");
							i = num;
						}
						if(i + j == num){
							if(i < num/2){
							System.out.println(i + " + " + j + " = " + num);
						}
					}
				}
			}
		}
		}
	}
	
	// Executes function with userInput = n
	public void numbering(){
		System.out.println("Enter a positive integer: ");
		int userInput = kb.nextInt();
		int n = userInput;
		int i = 0;
		if (userInput == 1){
			System.out.println("f^1("+userInput+") = 1");
		}
		else{
			while(userInput != 1){
				if(userInput % 2 == 0){
					int m = userInput;
					userInput = userInput / 2;
					System.out.println((i+1) + ". " + m +" / 2 = " + userInput);
					i++;
				}
				else if(userInput % 2 == 1){
					int m = userInput;
					userInput = (userInput * 3) + 1;
					System.out.println((i+1) + ". (" + m +" x 3) + 1 = " + userInput);
					i++;
				}
			}
			System.out.println("f^"+i +"("+ n +") = " + userInput);
		}
	}
	
	// Validates that the user's input was a proper input
	public boolean validateUserInput(){
		System.out.println("");
		System.out.println("Enter ONLY subsequent primes to the power of an even number between 1 and 23");
		System.out.println("For Example 2^17*3^21*5^11*7^21*11^19*13^3*17^1*19^13");
		String userInput = kb.next();
		System.out.println("UserInput: " + userInput);
		char[] godelInput = new char[userInput.length()];
		godelInput = userInput.toCharArray();
		for(int i = 0; i < godelInput.length; i++){
			if(godelInput[i] == '1' || godelInput[i] == '2' ||godelInput[i] == '3' || godelInput[i] == '4' || godelInput[i] == '5' ||godelInput[i] == '6' ||godelInput[i] == '7' ||godelInput[i] == '8' || godelInput[i] == '9'||godelInput[i] == '0' | godelInput[i] == '*' || godelInput[i] == '^'){
				i++;
			}
			else{
				return false;
			}
		}
		this.godelInput = godelInput;
		return true;
	}
	
	// Gets the base userPrimes and userExponents of char value to int
	public boolean userPrimesAndExponents(){
		String[] primes = new String[godelInput.length]; // The primes of what the user inputted
		String[] exponents = new String[godelInput.length]; // The userExponents of the primes from godelInput
		primes[0] = "2";
		for(int i = 1; i < godelInput.length; i++){
			if(godelInput[i] == '*'){
				i = i + 1;
				//System.out.println("GETS TO *");
				boolean go = true;
				char z = godelInput[i];
				while(go){
					if(i < godelInput.length - 1 && godelInput[i+1] != '^'){
						String str = Character.toString(z);
						str = str + godelInput[i+1];
						primes[i] = str;
						//System.out.println("STRING: " + str);
						//System.out.println("Primes: " + primes[i]);
						go = false;
						
					}
					else /*if(godelInput[i+1] == '*')*/{
						String str = Character.toString(z);
						primes[i] = str;
						//System.out.println("STRING: " + str);
						//System.out.println("Primes: " + primes[i]);
						go = false;
					}
				}
			}
			else if(godelInput[i] == '^'){
				i = i + 1;
				boolean go = true;
				//System.out.println("GETS TO ^");
				while(go){
					//System.out.println("GETS TO FOUND");
					char z = godelInput[i];
					if(i < godelInput.length - 1 && godelInput[i+1] != '*'){
						String str = Character.toString(z);
						str = str + godelInput[i+1];
						exponents[i] = str;
						//System.out.println("STRING: " + str);
						//System.out.println("Exponents: " + exponents[i]);
						go = false;
					}
					else /*if(godelInput[i+1] == '^')*/{
						String str = Character.toString(z);
						//System.out.println("STRING: " + str);
						exponents[i] = str;
						//System.out.println("Exponents: " + exponents[i]);
						go = false;
					}
				}
			}
		}
		this.userPrimes = primes;
		this.userExponents = exponents;
		return true;
	}

	public void getPrimes(){
		int stars = 0;
		for(int i = 0; i < godelInput.length; i++){
			if(godelInput[i] == '*'){
				stars += 1;
			}
		}
		int[] truePrimes = new int[stars];
		for(int j = 0; j < truePrimes.length; j++){
			if(isPrime(j) == true){
				truePrimes[j] = j;
			}
		}
	}
	
	// Prints out the Godel Numbers equation! 
	public void sequence(String[] exponents){
		for(int i = 0; i < exponents.length; i ++){
			if(exponents[i] != null){
				if(exponents[i].equals("1")){
					System.out.print(zero);
				}
				if(exponents[i].equals("3")){
					System.out.print(successor);
				}
				if(exponents[i].equals("5")){
					System.out.print(not);
				}
				if(exponents[i].equals("7")){
					System.out.print(or);
				}
				if(exponents[i].equals("9")){
					System.out.print(forAll);
				}
				if(exponents[i].equals("11")){
					System.out.print(leftParenthesis);
				}
				if(exponents[i].equals("13")){
					System.out.print(rightParenthesis);
				}
				if(exponents[i].equals("15")){
					System.out.print(and);
				}
				if(exponents[i].equals("17")){
					System.out.print(thereExists);
				}
				if(exponents[i].equals("19")){
					System.out.print(equals);
				}
				if(exponents[i].equals("21")){
					System.out.print("x");
				}
				if(exponents[i].equals("23")){
					System.out.print("y");
				}
				if(exponents[i].equals("null")){
					System.out.print("");
				}
				System.out.print("");
			}
		}
	}

	
    public static void main(String[] args){
    	
	    Theorem calc = new Theorem();
	    
	    //Exercise 1
	    System.out.println("Problem 1");
	    calc.getNum();
	    System.out.println();
	    
	    //Exercise 2
	    calc.calculation(calc.number);
	    System.out.println("");
	    System.out.println("Problem 2");
	    System.out.println("f(n) = { n/2 if n even");
	    System.out.println("       { 3n + 1 if n odd");
	    calc.numbering();
	    
	    //Exercise 3
	    char z = 'z';
	    String a = Character.toString(z);
	    System.out.println(a);
	    if(calc.validateUserInput() == true){
		    calc.userPrimesAndExponents();
	    }
		else{
			System.out.println("Not allowed.");
		}
	    calc.sequence(calc.userExponents);
	    System.out.println("");
	    System.out.println("Godel's Number Sequence is complete!");
    }
}