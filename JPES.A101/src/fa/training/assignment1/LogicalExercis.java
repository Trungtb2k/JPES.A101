package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int a = sc.nextInt();
		System.out.print("Input second integer: ");
		int b = sc.nextInt();
		if(a==b) {
			System.out.println(a + " = "+b);
		}
		if(a!=b) {
			System.out.println(a + " != "+b);
		}
		if(a>b) {
			System.out.println(a + " > "+b);
		}
		if(a<b) {
			System.out.println(a + " < "+b);
		}
		if(a>=b) {
			System.out.println(a + " >= "+b);
		}
		if(a<=b) {
			System.out.println(a + " <= "+b);
		}

	}

}
