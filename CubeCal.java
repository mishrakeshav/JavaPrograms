import java.util.*;
class Cube{
	int length, width, height;

	void getdata(int a,int b,int c){
		length = a;
		width = b;
		height = c;
	}

	int SurfaceArea(){
		return 2*(length*width + width*height + height*length);
	}
	int Volume(){
		return length*width*height;
	}
}
class CubeCal{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int l, w, h;
		System.out.println("Enter length: ");
		l = input.nextInt();
		System.out.println("Enter width: ");
		w = input.nextInt();
		System.out.println("Enter height: ");
		h = input.nextInt();
		Cube c1 = new Cube();
		c1.getdata(l, w, h);
		System.out.println("Surface area = " + c1.SurfaceArea());
		System.out.println("Volume = " + c1.Volume());

		
		Cube c2 = new Cube();
		System.out.println("Enter length: ");
		c2.length = input.nextInt();
		System.out.println("Enter width: ");
		c2.width = input.nextInt();
		System.out.println("Enter height: ");
		c2.height = input.nextInt();
		System.out.println("Surface area = " + c2.SurfaceArea());
		System.out.println("Volume = " + c2.Volume());






	}
}