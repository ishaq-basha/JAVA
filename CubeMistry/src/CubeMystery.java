import java.util.*;
public class CubeMystery {
	public static int cubeNumber(int num) {
		return num*num*num;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scan.nextInt();
		
		int cube = cubeNumber(num);
		System.err.println("the cube of " +num + " is: " +cube);
		scan.close();
		
	}
	
}
