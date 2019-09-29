import java.util.Scanner;

public class CelsiusConverter {
	
	public static void main(String[] args) {
		
		double celsiusDegree;
		Scanner input = new Scanner(System.in);
		
		celsiusDegree = input.nextDouble();
		
		double fahrenheitDegree = (9.0/5.0)*celsiusDegree + 32;
		
		System.out.println("Celcisus degree: " + celsiusDegree);
		System.out.println("Fahrenheit degree: " + fahrenheitDegree);
		input.close();
	}
}
