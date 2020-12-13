public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	public static int square(int num1) {
		return (int) Math.pow(num1,2);
	}
	public static void main(String[] args) {
//Tests out the Calculator methods
		System.out.println("2 + 3 is: " + add(2,3));
		System.out.println("6 - 3 is: " + subtract(6,3));
		System.out.println("4 x 3 is: " + multiply(4,2));
		System.out.println("10 / 5 is: " + divide(10,5));
		System.out.println("The square root of 8 is: " + square(8));
	}

		}
