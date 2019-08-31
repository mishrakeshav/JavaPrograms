//method overloading
class Room{
	float l, b;
	Room(int x, int y) // Constuctor 1
	{
		l = x;
		b = y;
	}
	Room(int x) //Constructor 2
	{
		l=b=x;
	}
	float area()
	{
		return l*b;
	}
}
class Room_Area{
	public static void main(String args[]){
		Room r1 = new Room(10);
		System.out.println("Area of room 1 = "+ r1.area());

		Room r2 = new Room(10, 20);
		System.out.println("Area of room 2 = "+ r2.area());

	}
}