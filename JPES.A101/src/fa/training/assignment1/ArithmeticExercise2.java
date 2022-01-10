package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = sc.nextInt();

		System.out.print("Input second number: ");
		int b = sc.nextInt();
		
		System.out.println(a + " + "+ b + " = " +(a+b));
		System.out.println(a + " - "+ b + " = " +(a-b));
		System.out.println(a + " x "+ b + " = " +(a*b));
		System.out.println(a + " / "+ b + " = " +(a/b));
		System.out.println(a + " % "+ b + " = " +(a%b));
		sc.close();

	}

}
