public class RoomOccupancy {

	//Initial Variables
	public static int totalNumber = 0;
	public int numberInRoom;

	public int getNumberInRoom(){
		return this.numberInRoom;
	}
	
	//Methods
	public void addOneToRoom(int amount){
		System.out.println(amount + " Added");
		for(int i = 0; i < amount; i++){
			totalNumber ++;
			numberInRoom ++;
		}
	}
	
	public void removeOneFromRoom(int amount){
		System.out.println(amount + " Removed");
		for(int i = 0; i < amount; i++){
			totalNumber --;
			numberInRoom --;
		}
	}
	
	public int getNumber(){
		return this.numberInRoom;
	}
	
	public static int getTotal(){
		return totalNumber;
	}
}