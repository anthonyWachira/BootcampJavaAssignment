package bootCampAssignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a , num;
		boolean isPrime = true;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		for(int i =2; i<= num/2; i++) {
			a = num%i;
			if (a==0) {
				isPrime = false;
				break;
			}
		}
		 if(isPrime)
			 System.out.println( num + " is prime number");
		 else
			 System.out.println(num + " is not a Prime number");

	}

}
