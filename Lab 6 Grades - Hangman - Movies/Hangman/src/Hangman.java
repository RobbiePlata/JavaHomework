//Robert C Plata III
public class Hangman {
	
	
	// Instance Variables
	public String disguisedWord;
	public String secretWord = "templestarcraft";
	public int correctGuessCount = 0;
	public int incorrectGuessCount = 0;
	public boolean isFound = false;
	
	/*
	 * Helper method that your professor wrote for you, 
	 * so you don't have to write it.
	 * It will help you for makeGuess(char c)
	 * 
	 * Given a string, an index in the String, and a character,
	 * this method will return a *new* String replacing the character at
	 * index with c
	 * 
	 * for example
	 * 
	 * String foo = "barn";
	 * foo = replaceCharAtIndex(foo, 3, 'd');
	 * 
	 * will create a new string "bard" and change foo to it
	 * 
	 */
	
	// Word is made into character array, array(number) indicates location in array. Word is returned.
	private String replaceCharAtIndex(String word, int index, char c){
		char[] arr =  word.toCharArray(); 
		arr[index] =  c;
		word = new String(arr);
		return word;
		
	}
	
	// Gets disguised word and returns function as that variable
	public String getDisguisedWord(){
		return this.disguisedWord; 
	}
	
	// Secret word getter
	public String getSecretWord(){
		return this.secretWord;
	}
	
	// Method for only right and wrong answers
	public int[] getGuessCount(){
		int[] guessCounts = new int[2]; //integer array with 2 options 
		guessCounts[0] = this.correctGuessCount; // 0 for correct
		guessCounts[1] = this.incorrectGuessCount; // 1 for incorrect
		return guessCounts;
	} 
	
	public boolean isFound(){
		return this.isFound; // false in this method
	}

	/* guesses if c is in the secret word.
	 * if it is, changes all indices the disguised word to c where there is a 
	 * matching character in the secret word
	 * 
	 * Example:
	 * if our secret word is        "banana", 
	 * our disguised word starts as "??????"
	 * If someone calls makeGuess('a'), then makeGuess changes the disguised 
	 * word to "?a?a?a"
	 * Calling makeGuess('n') would change the disguised word to "?anana"
	 * 
	 */
	
	// Guess with a 'character'
	public void makeGuess(char c){
		String secretWord = this.getSecretWord(); // secretWord method call
		char[] secretWordArr =  secretWord.toCharArray(); // Secret word array
		boolean correctGuess = false; 
		if(this.getGuessCount()[0] + this.getGuessCount()[1] == 0){
			String disguisedWord = "";
			for(int i=0; i<secretWordArr.length; i++){
				disguisedWord = disguisedWord + "?";
			}
			this.disguisedWord = disguisedWord;
		}
		else{
			String disguisedWord = this.getDisguisedWord();
		}
		char[] disguisedWordArr =  disguisedWord.toCharArray();
		
		for(int j=0; j < disguisedWordArr.length; j++){ //for arr length, see if checkChr is euqal to index
			char checkChr = secretWordArr[j];
			if(checkChr == c){
				disguisedWord = this.replaceCharAtIndex(disguisedWord, j, c); // replace char function 
				if(secretWord.equals(disguisedWord)){ // if disguised word matches secretword 
					this.isFound = true; // isFound is now true
				}
				correctGuess = true;
			}
			
		 }
		if(correctGuess){
			this.correctGuessCount++; //add correct
		}
		else{
			this.incorrectGuessCount++; //add incorrect
		}
		System.out.println(disguisedWord);
		this.disguisedWord = disguisedWord;
		
	}
	
	
}