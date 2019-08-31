// Creating class and objects
import java.util.*;

class Rect{

	int length, width;

	void getdata(int a, int b){
		length = a;
		width = b;
	}
	int area(){
		return length*width;
	}
}
class rectangle{
	public static void main(String args[]){
		int l, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		l = sc.nextInt();
		System.out.print("Enter width: ");
		b = sc.nextInt();
		Rect r1 = new Rect();
		r1.getdata(l, b);
		System.out.println("Area is " + r1.area());



	}
}