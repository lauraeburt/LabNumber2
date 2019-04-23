import java.util.Scanner;

public class AreaPerimeter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char userChar = 'y';
		
		System.out.println("Welcome to Grand Circus'Room Detail Generator!");
		System.out.println();
		
		do {

			System.out.println("Enter Length: ");

			double length = scan.nextDouble();

			System.out.println("Enter Width: ");

			double width = scan.nextDouble();
			
			System.out.println("Enter Height: ");

			double height = scan.nextDouble();

			double area = length * width;
			System.out.println("Area: " + area);

			double perimeter = 2 * length + 2 * width;
			System.out.println("Perimeter: " + perimeter);
			
			double volume =  length * width * height;
			System.out.println("Volume: " + volume);

			System.out.println();
			scan.nextLine();
			System.out.println("Continue (y/n): ");

			userChar = scan.next().charAt(0);
			userChar = Character.toLowerCase(userChar);
			
			
		} while (userChar == 'y');
		
		System.out.println("Thank you for using the Grand Circus Room Generator!");
		scan.close();
	}
}
