package package1;

import java.util.Scanner;

//WP to read three int values and perform addition operation in Java?
public class Demo2 {

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int sum = a+b+c;
		System.out.println(sum);
		obj.close();
	}
}
