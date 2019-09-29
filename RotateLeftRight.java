
public class RotateLeftRight {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		int w = 4;
		int temp = 0;
		
	
		temp = x;
		x = y;
		y = z;
		z = w;
		w = temp;	
		// Left Rotation Output
		System.out.println("X = " + x +
							" Y = " + y +
							" Z = " + z +
							" W = " + w + " Left Rotaiton");

		temp = z;
		z = x;
		x = temp;	
		temp = w;
		w = y;
		y = temp;	
		// Right Rotation Output
		System.out.println("X = " + x +
							" Y = " + y +
							" Z = " + z +
							" W = " + w + " Right Rotation");
		
	}
}
