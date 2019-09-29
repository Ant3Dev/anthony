import java.util.Scanner;

public class Area_Of_Rectangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double length;
		double width;
		
		length = input.nextDouble();
		width = input.nextDouble();
		
		double area = length * width;
		
		System.out.println("The area of the rectangle with a" + " Length of " + length + " and a Width of " + width + " is " + area);
		input.close();
	}
}
