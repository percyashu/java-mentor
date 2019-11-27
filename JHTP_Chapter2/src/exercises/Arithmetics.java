package exercises;

import java.util.Scanner;

public class Arithmetics {
	
	public static void main(String args[]) {
	System.out.println("Enter two numbers");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number 1");
	int num1= scan.nextInt();
	System.out.println("Enter number 2");
	int num2= scan.nextInt();
	System.out.printf("Sum of numbers :%d \n",num1+num2);
	System.out.printf("Product of numbers :%d \n",num1*num2);
	System.out.printf("Difference of numbers :%d \n",num1-num2);
	double div=num1/num2;
	System.out.println("Division of numbers : "+div);
	
}
}
