//Robert C Plata III

public class Movie {

	//Instance variables
	public String name;
	public String rating;
	public int oneStarReviews = 0;
	public int twoStarReviews = 0;
	public int threeStarReviews = 0;
	public int fourStarReviews = 0;
	public int fiveStarReviews = 0;
	public double score = 0.0;
	public int totalReviews = 0;
	public double average;
	
	// Getter for Movie Name
	public String getMovieName(){
		return this.name;
	}
	//Getter for Movie Rating
	public String getRating(){
		return rating;
	}
	
	//Methods
	public void addReview(int stars){
		if(stars <= 5 && stars >= 1){ // must be in between 1 and 5
			if(stars == 1){
				this.oneStarReviews++; // Amount of one star reviews
				this.score = this.score + 1.0; // Values for weighted score
			}
			else if(stars == 2){
				this.twoStarReviews++; 
				this.score = this.score + 2.0;
			}
			else if(stars == 3){
				this.threeStarReviews++;
				this.score = this.score + 3.0;
			}
			else if(stars == 4){
				this.fourStarReviews++;
				this.score = this.score + 4.0;
			}
			else if(stars == 5){
				this.fiveStarReviews++;
				this.score = this.score + 5.0;
			}
			this.totalReviews++; // total reviews
		}
		else {
			System.out.println("lmao"); // lmao (can't happen?) better safe than sorry
		}
	}	
	
	//Method for getting average
	public double getAverage(){ 
		this.average = this.score / this.totalReviews; //
		return this.average;
	}
	
	public static void main(String[] args) {
		
		// Assignment variable to method
		Movie Interstellar = new Movie();
		Interstellar.name = "Interstellar";
		Interstellar.rating = "PG13";
		Interstellar.addReview(5);
		Interstellar.addReview(5);
		Interstellar.addReview(5);
		Interstellar.addReview(2);
		Interstellar.addReview(3);
		
		//Getting average from method
		double interstellarRating = Interstellar.getAverage();
		
		System.out.println("Average rating for Interstellar");
		System.out.println();
		System.out.println((int)interstellarRating+ " Stars");
		
		//Watchmen
		Movie Watchmen = new Movie();
		Watchmen.name = "Watchmen";
		Watchmen.addReview(2); // review with 2 stars
		Watchmen.addReview(1); // review with 1 stars
		Watchmen.addReview(3); // review with 3 stars
		Watchmen.addReview(2); // review with 2 stars
		Watchmen.addReview(2); // review with 2 stars
		
		// Variable from method to print system.out
		double watchmenRating = Watchmen.getAverage();
		
		// Information for console
		System.out.println("Average rating for Watchmen");
		System.out.println();
		// Explicit cast to lose precision -- > http://stackoverflow.com/questions/10280520/convert-double-to-int-rounded-down
		System.out.println((int)watchmenRating + " Stars");
	}
}