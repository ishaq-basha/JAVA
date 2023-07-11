import java.util.Scanner;

	public class TemperatureConverterApp {

		public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);

			System.out.println("Enter temp in F");

			double f=scan.nextDouble();

			TempConverter temperatureConverter=new TempConverter();

			System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
			
			scan.close();
		}

}
