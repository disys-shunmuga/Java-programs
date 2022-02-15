import java.util.Scanner;
abstract class Currency
{
	double converter(double amt)
	{
		System.out.println("The currency is get converted");
		return 0;
	}
	double converter1(double amt)
	{
		System.out.println("The currency is get converted");
		return 0;
	}
	
}
class Yen extends Currency
{
	double yen,inr;
	double converter(double amt)
	{
		
		yen = amt;
		inr = yen * 0.65;
		return inr;
	}
	double converter1(double amt)
	{
		inr = amt;
		yen = inr * 1.54;
		return yen;
	}
	
}
class Dollars extends Currency
{
	double dollar,inr;
	double converter(double amt)
	{
		dollar = amt;
		inr = dollar * 74.34;
		return inr;
		
	}
	double converter1(double amt)
	{
		inr = amt;
		dollar = inr * 0.013;
		return dollar;
	}
}
class Euro extends Currency
{
	double euro,inr;
	double converter(double amt)
	{
		euro = amt;
		inr = euro * 84.89;
		return inr;
	}
	double converter1(double amt)
	{
		inr = amt;
		euro = inr * 0.012;
		return euro;
	}
}
public class Currency_conventer {
	public static void main(String args[])
	{
		double amt;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		amt = sc.nextDouble();
		Currency c = new Yen();
		System.out.println(amt+" Yen to the INR amount is : "+c.converter(amt));
		System.out.println(amt+" Inr to the Yen amouint is : "+c.converter1(amt));
	    c = new Dollars();
		System.out.println(amt+" Dollar to the INR amount is : "+c.converter(amt));
		System.out.println(amt+" Inr to the Dollar amouint is : "+c.converter1(amt));
		c = new Euro();
		System.out.println(amt +" Euro to the INR amount is : "+ c.converter(amt));
		System.out.println(amt+" Inr to the Euro amouint is : "+c.converter1(amt));
	}

}
