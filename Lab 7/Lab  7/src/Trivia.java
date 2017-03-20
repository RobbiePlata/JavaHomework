//Robert Cyril Plata III
import java.util.Scanner;

public class Trivia {

	Scanner kb = new Scanner(System.in);
	
	//Initial Variables
	public String question;
	public String answer;
	public String guess; 
	public boolean run = true;
	
	
	//Getters/Setters
	public String getQuestion(){
		return this.question;
	}
	public void setQuestion(String question){
		this.question = question;
	}
	public String getAnswer(){
		return this.answer;
	}
	public void setAnswer(String answer){
		this.answer = answer;
	}
	public String getGuess(){
		return this.guess;
	}
	public void setGuess(String guess){
		this.guess = guess;
	}
	
	//Method initiating a loop until the user's guess matches the answer
	public void makingGuess(){
		while(run == true){
			guess = kb.nextLine();
			if(guess.equals(answer)){
				System.out.println("correct");
				run = false;
			}
			else{
				System.out.println("false");
			}
		}
	}
	
	public static void main(String[] args) {
		
		//Questions defined by objects
		
		//Football Question
		Trivia football = new Trivia();
		football.question = "What is the name of Philadelpha's NFL football team?";
		football.answer = "eagles";
		System.out.println(football.question);
		football.makingGuess();
		
		//President
		Trivia engine = new Trivia();
		engine.question = "What is the most popular search engine?";
		engine.answer = "google";
		System.out.println(engine.question);
		engine.makingGuess();
	}

		//football.guess = kb.next();
		//football.newGuess(football.guess);
		//System.out.println(football.guess);
}