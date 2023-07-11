import java.util.*;
public class FinanceCalculator {
	public double calculateSimpleInterest(double principal, double rate, double time) {
		double I = principal * rate * time;
		return I;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		Double principal = scan.nextDouble();
		System.out.println("Enter the Rate: ");
		Double rate = scan.nextDouble();
		System.out.println("Enter the Time: ");
		Double time = scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.println( "The simple interest is: " + calculator.calculateSimpleInterest(principal, rate, time));
		scan.close();
	}
}
