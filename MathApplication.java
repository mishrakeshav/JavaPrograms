// Static methods;

class MathOperation
{
	static float mul(float x, float y){
		return x*y;
	}
	static float div(float x, float y){
		return x/y;
	}
	static float add(float x, float y){
		return x+y;
	}
	static float sub(float x, float y){
		return x-y;
	}
}

class MathApplication{

	public static void main(String args[]){
		float a = 10 , b = 20;
		System.out.println("Addition = " + MathOperation.add(a,b));
		System.out.println("Subtraction = " + MathOperation.sub(a,b));
		System.out.println("Multiplication = " + MathOperation.mul(a,b));
		System.out.println("Division  = " + MathOperation.div(a,b));
	}
}