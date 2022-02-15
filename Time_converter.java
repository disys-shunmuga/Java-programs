import java.util.Scanner;
abstract class Time
{
	double Converter(double time)
	{
		System.out.println("The time is get converted");
		return 0;
	}
	double converter(double time)
	{
		System.out.println("the time is get converted");
		return 0;
	}
}
class Hours extends Time
{
	double hour,min;
	double Converter(double time)
	{
		min = time;
		hour = min * 0.0166667;
		return hour;
	}
	double converter(double time)
	{
		hour = time;
		min = hour * 60;
		return min;
	}
}
class Seconds extends Time
{
	double sec,min;
	double Converter(double time)
	{
		sec = time;
		min = sec * 0.0166667;
		return min;
	}
	double converter(double time)
	{
		min = time;
		sec = min * 60;
		return sec;
	}
}
public class Time_converter {
	public static void main(String args[])
	{
		double time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time : ");
		time = sc.nextDouble();
		Time t = new Hours();
		System.out.println(time +" minutes is equal to "+t.Converter(time)+" hours");
		System.out.println(time +" hours is equal to "+t.converter(time)+" minutes");
		t = new Seconds();
		System.out.println(time +" Seconds is equal to "+t.Converter(time)+" minutes");
		System.out.println(time +" minutes is equal to "+t.converter(time)+" Seconds");
	}

}
