package assignmentCollectionsExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String continueChoice ="";
		do {
			System.out.print("Please enter the dividend: ");
			try {
				int x = sc.nextInt();
				System.out.print("Please enter the divisor : ");
				int y = sc.nextInt();
				double quotient = x / y;
				System.out.println("Quotient of the operation: " + quotient);
			} catch (InputMismatchException inputMismatchException) {
				sc.nextLine();
				System.out.println("The entered value does not match the expected type.");
				System.out.println("Press Y if you want to try again.");
				continueChoice = sc.next();

			} catch (ArithmeticException arithmeticException) {
				System.out.println("Dividing a number by zero is not a valid arithmetic operation.");
				System.out.println("Press Y if you want to try again.");
				continueChoice = sc.next();
			}

			finally {
				System.out.println("Thank you");
			}
		} while (continueChoice.equalsIgnoreCase("y"));
		sc.close();

	}

}
