import java.util.Scanner;

public class VolumeOfCone {
	
	public static void main(String[] args) {
		
		int height;
		int radius;
		
		Scanner input = new Scanner(System.in);
		
		height = input.nextInt();
		radius = input.nextInt();
		
		double volume = (22*radius*radius*height)/(3*7);
		
		double meters = volume * .03048;
		System.out.println(meters);
		input.close();	
	}
}
