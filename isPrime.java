import java.lang.Math;
import java.util.*;

class isPrime{
	public static void main(String args[]){

		int n,i, flag ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		n = sc.nextInt();
		flag = 0;
		for(i=2; i< Math.sqrt(n)+1; i++){
			if(n%i==0){
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println(n+" is a prime number");
			
		}
		else{
			System.out.println(n+" is not a prime number");
		}
		
	
	}


}