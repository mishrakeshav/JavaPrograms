// use of constructors
import java.util.*;
class Pmeter{

	int l , w;
	Pmeter(){
		l = 0;
		w = 0;
	}
	Pmeter(int a, int b){
		l = a;
		w = b; 
	}

	int getperimeter(){
		return 2*(l+w);
	}
}

class Perimeter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Pmeter r1 = new Pmeter(10, 20);
		System.out.println("Perimeter is " + r1.getperimeter());

		Pmeter r2 = new Pmeter();
		System.out.println("Perimeter is " + r2.getperimeter());


	}

}