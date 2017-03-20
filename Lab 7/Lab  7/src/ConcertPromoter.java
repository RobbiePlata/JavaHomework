//Robert Cyril Plata III
public class ConcertPromoter {
	
	// Initial Variables
	public String name;
	public int capacity;
	public int sold;
	public double phonePrice;
	public double venuePrice;
	public int ticketsRemaining;
	public double moneyPhone;
	public double moneyVenue;
	
	//Getters
	public String getName(){
		return this.name;
	}
	public int getCapacity(){
		return this.capacity;
	}
	public int getSold(){
		return this.sold;
	}
	public double getPhonePrice(){
		return this.phonePrice;	
	}
	public double getVenuePrice(){
		return this.venuePrice;
	}
	
	//Setters
	public void setName(String name){
		this.name = name;
	}
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public void setSold(int sold){
		this.sold = sold;
	}
	public void setPhonePrice(double phonePrice){
		this.phonePrice = phonePrice;
	}
	public void setVenuePrice(double venuePrice){
		this.venuePrice = venuePrice;
	}
	
	//Methods
	public int soldTickets(int amount){
		this.sold = sold + amount;
		return this.sold;
	}
	//Get tickets remaining from a single parameter
	public int getTicketsRemaining(int amt){
		this.ticketsRemaining = capacity - amt;
		return ticketsRemaining;
	}
	//Get total price of the phone sales based on amount sold
	public double phonePriceTotal(double amt){
		amt = this.phonePrice * amt;
		return this.moneyPhone = amt;
	}
	//Get total price of the venue sales based on amount sold
	public double venuePriceTotal(double amt){
		amt = this.venuePrice * amt;
		return this.moneyVenue = amt;
	}
	//Get the amount of money made from a sale
	public double completeTotal(double one, double two){
		double total = one + two;
		return total;
	}
	
	//Main program displaying calculations
	public static void main(String[] args) {
		
		ConcertPromoter concert1 = new ConcertPromoter();
		
		//Assignment Variables
		String arminConcert = concert1.name = "Armin van Buuren";
		concert1.capacity = 100;
		concert1.phonePrice = 50;
		concert1.venuePrice = 120;
		
		//Sale #1
		int phonesales1 = 30;
		int venuesales1 = 20;
		int both1 = phonesales1 + venuesales1;
		double total1 = concert1.completeTotal(concert1.phonePriceTotal(phonesales1), concert1.venuePriceTotal(venuesales1));

		//Printout of method calculations
		System.out.println("Concert: " + arminConcert);
		System.out.println();
		System.out.println("Sale 1");
		System.out.println("Sold by phone: " + phonesales1);
		System.out.println("Sold at venue: " + venuesales1);
		System.out.println("Total Tickets sold: " + both1);
		System.out.println("All Tickets remaining: " + concert1.getTicketsRemaining(both1));
		System.out.println("All phone sales: $" + concert1.phonePriceTotal(phonesales1));
		System.out.println("All venue sales: $" + concert1.venuePriceTotal(venuesales1));
		System.out.println("Total amount made from sale 1: $" + total1);
		
		//Sale #2
		int phonesales2 = 20;
		int venuesales2 = 10;
		int both2 = phonesales2 + venuesales2;
		double total2 = concert1.completeTotal(concert1.phonePriceTotal(phonesales2), concert1.venuePriceTotal(venuesales2));
		
		//Printout of method calculations 
		System.out.println();
		System.out.println("Sale 2");
		System.out.println("Sold by phone: " + phonesales2);
		System.out.println("Sold at venue: " + venuesales2);
		System.out.println("Total Tickets sold: " + both2);
		System.out.println("All Tickets remaining: " + concert1.getTicketsRemaining(both1 + both2));
		System.out.println("All phone sales: $" + concert1.phonePriceTotal(phonesales2));
		System.out.println("All venue sales: $" + concert1.venuePriceTotal(venuesales2));
		System.out.println("Total amount made from sale 1: $" + total2);
		System.out.println();
		
		//Complete Earnings for all sales
		System.out.println("Tickets Sold: " + (both1 + both2));
		System.out.println("Tickets unsold: " + concert1.getTicketsRemaining(both1 + both2));
		System.out.println("Amount made from both sales: $" + (total1 + total2));


	}
}
