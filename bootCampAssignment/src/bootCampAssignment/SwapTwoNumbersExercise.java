package bootCampAssignment;

import java.util.Scanner;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		int a, b, temp;
		System.out.println("Enter two numbers a and b");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Before Swapping: " + a+"," + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping: " + a+ ","  + b);

	}

}
