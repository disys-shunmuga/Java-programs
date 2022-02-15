import java.util.*;
public class Addition {
	
	void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("The value of a is :"+a+" The value of b is : "+b);
		System.out.println("The sum the values are : "+sum);
	}
	void add(double a,double b)
	{
		double sum = a+b;
		System.out.println("The value of a is :"+a+" The value of b is : "+b);
		System.out.println("The sum of the values are : "+sum);
	}
	public static void main(String args[])
	{
		int number1,number2;
		double number3,number4;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number : ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.print("Enter the doubke number : ");
		number3 = sc.nextDouble();
		number4 = sc.nextDouble();
		
		Addition a = new Addition();
		a.add(number1, number2);
		a.add(number3, number4);
		
	}

}
