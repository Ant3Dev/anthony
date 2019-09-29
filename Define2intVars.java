import java.util.Scanner;

public class Define2intVars {
	
	public static void main(String[] args) {
		
		int vx;
		int vy;
		int x = 0;
		int y = 0;
		
		Scanner input = new Scanner(System.in);
		
		vx = input.nextInt();
		vy = input.nextInt();
		
		System.out.println("vx = " + vx);
		System.out.println("vy = " + vy);
	
		x = vx;
		y = vy;
		
		System.out.println("vx = " + y);
		System.out.println("vx = " + x);	
		
		input.close();
	}
}
