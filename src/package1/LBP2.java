package package1;

import java.util.Scanner;

/* Given an integer n, perform the following conditional actions,
if n is odd, print weird,
if n is even and in the inclusive range of 2 to 5, print Not Weird.
if n is even and in the inclusive range of 6 to 20, print Weird.
if n is even and greater than 20, print Not Weird.
input-----> a number from the user
contraint-> 1<=n<=100
output----> Weird or Not Weird
*/
public class LBP2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>=1&&n<=100) {
			if(n%2!=0) 
			System.out.println("weird");
			else {
				if(n>=2&&n<=5) 
					System.out.println("Not Weird");
				else if(n>=6&&n<=20)
					System.out.println("Weird");
				else
					System.out.println("Not Weird");
			}
		}

	}

}
