import java.util.*;
public class PlanetExplorer {
	public double calculateSurfaceArea(double radius) {
		float pi = 3.14f;
		double area = 4* pi *(radius*radius);
		return area;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius:" );
		double radius = scan.nextDouble();
		PlanetExplorer obj = new PlanetExplorer();
		System.out.println("surface area of a sphere:" +obj.calculateSurfaceArea(radius));
		
	}
	

}
