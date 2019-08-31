import java.util.*;
class Room{
	float length;
	float breadth;
	void getdata(float a, float b){
		length = a;
		breadth = b;	
	}
	float area(){
		return length*breadth;
	}


}
class RoomArea{
	
	public static void main(String args[]){
		
		Room r1 = new Room();
		r1.getdata(10,20);
		System.out.println("Area: "+ r1.area());
	}	
}