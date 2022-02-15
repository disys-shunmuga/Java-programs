package decimal_to_binary;
import java.util.*;
public class Decimal_To_Binary {
	public static void main(String args[])
	{
		String n;
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		System.out.println(Integer.parseInt(n,2));
	}
}
