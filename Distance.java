import java.util.Scanner;
abstract class Distance_converter
{
	double Converter(double distance)
	{
		System.out.println("The distance is get converted ");
		return 0;
	}
	double converter(double distance)
	{
		System.out.println("The distance is get converted ");
		return 0;
	}	
}
class Miles extends Distance_converter
{
	double miles,km;
	double Converter(double distance)
	{
		miles = distance;
		km = miles * 1.60934;
		return km;
	}
	double converter(double distance)
	{
		km = distance;
		miles = km * 0.621371;
		return miles;
	}
}
class Meter extends Distance_converter
{
	double meter,km;
	double Converter(double distance)
	{
		meter = distance;
		km = meter * 0.001;
		return km;
	}
	double converter(double distance)
	{
		km = distance;
		meter = km * 1000;
		return meter;
	}
}
public class Distance {
	public static void main(String args[])
	{
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance : ");
		distance = sc.nextDouble();
		Distance_converter dc = new Miles();
		System.out.println(distance +" miles is equals to " + dc.Converter(distance)+" Kilometers");
		System.out.println(distance +" kilometers is equal to "+dc.converter(distance)+" Miles");
		dc = new Meter();
		System.out.println(distance +" meter is equals to " + dc.Converter(distance)+" Kilometers");
		System.out.println(distance +" kilometers is equal to "+dc.converter(distance)+" meters");
	}

}
