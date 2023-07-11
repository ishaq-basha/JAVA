import java.util.*;
public class HeightConverter {
	public double convertInchesToFeet(double inches) {
		double feet = (inches/12);
		return feet;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your feet:");
		double inches = scan.nextDouble();
		HeightConverter obj = new HeightConverter();
		System.out.println("feet are:" + obj.convertInchesToFeet(inches));
	}

}
