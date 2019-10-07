import java.util.*;

public class inputString {
	
	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();	
		Scanner input = new Scanner(System.in);
		System.out.println("How many names are there?: ");
		int loop = input.nextInt();
		int x = 0;
			
			while (x != loop) {
				System.out.println("Enter name " + (x + 1) + ":");
				String names = input.next();
				nameList.add(names);
				x += 1;
			}
		
		System.out.println("The names have been saved to a list.");
		System.out.println("Would you like to see the list? (y/n)");
		
			if (input.next().startsWith("y")) {
				System.out.println("These are the names: " + nameList);
			} else {
				System.out.println("The list will not show.");
		
				
		input.close();
		}
	}
}