public class Room1 {
	
	
	public static void main(String[] args) {
		//Living Room
		RoomOccupancy LivingRoom = new RoomOccupancy();
		LivingRoom.addOneToRoom(40);
		LivingRoom.removeOneFromRoom(21);
		int roomNum = LivingRoom.getNumberInRoom();
		System.out.println("The number in LivingRoom is " + roomNum);
		System.out.println("Complete total is " + RoomOccupancy.getTotal());
		
		System.out.println();
		
		//Kitchen
		RoomOccupancy Kitchen = new RoomOccupancy();
		Kitchen.addOneToRoom(30);
		Kitchen.removeOneFromRoom(4);
		int roomNum2 = Kitchen.getNumberInRoom();
		System.out.println("The number in Kitchen is " + roomNum2);
		
		System.out.println("Complete total is " + RoomOccupancy.getTotal());
		
		
		
		}

}
