import java.util.Scanner;

public class TimeConverter {
	public static double convertToHours(int minutes) {
		return (double) minutes / 60;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many minutes:");
		int minutes = scan.nextInt();
		
		double hours = convertToHours(minutes);
		System.out.println("equivalent to "+ hours + " hours ");
		scan.close();
	}
}
