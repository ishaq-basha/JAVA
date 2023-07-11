import java.util.Scanner;

public class Half {
	public static double halveTheNumber(double num) {
		return num/2;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to Halve it...:");
		double number = scan.nextDouble();
		double half = halveTheNumber(number);
		System.out.println("half of the number is:" +half);
		scan.close();
		
	}

}
