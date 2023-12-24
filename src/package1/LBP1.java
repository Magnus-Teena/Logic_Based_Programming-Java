package package1;

import java.util.Scanner;

/* Program to check whether the given number is even or odd number
input-----> an integer number n
contraint-> n>=0
output----> even or odd or invalid
*/
public class LBP1 {

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		if(n>=0) {
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		else
			System.out.println("Invalid");
		obj.close();
	}
}
