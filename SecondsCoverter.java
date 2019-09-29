import java.util.Scanner;

public class SecondsCoverter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sec;	
		sec = input.nextInt();
		
		int hr = sec / 3600;
		int r = sec % 3600;
		int min = r / 60;
		int secs = r % 60;
		
		System.out.println(hr + " hours: " + min + " minutes: " + secs + " seconds");	
		input.close();
	}
}
