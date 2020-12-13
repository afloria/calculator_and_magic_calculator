public class MagicCalculator extends Calculator {
	
	protected static int x = 2;
//Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
	public static double sine(int x) {
		return Math.sin(x);
	}
//Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
	public static double cosine(int x) {
		return Math.cos(x);
	}
//Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
	public static double tan(int x) {
		return Math.tan(x);
	}
//Finds the factorial (!) of the number
	
	public static int factorial(int x) {
		int factorial = 1;
		for(int i = 1; i <= x; i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static void main(String[] args) {
	//Tests out the Magic Calculator
	System.out.println("The square root of 2 is: " + Calculator.square(x));
	System.out.println("-----------------------------------");
	System.out.println("Sine of 9 is: " + sine(9));
	System.out.println("-----------------------------------");
	System.out.println("Consine of 7 is: " + cosine(7));
	System.out.println("-----------------------------------");
	System.out.println("Tan of 5 is: " + tan(5));
	System.out.println("-----------------------------------");
	System.out.println("Factorial of 5 is: " + factorial(5));
	System.out.println("-----------------------------------");
	}

}
