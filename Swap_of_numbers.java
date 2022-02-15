import java.util.*;
public class Swap_of_numbers {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		a = b+a;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
	}
}
