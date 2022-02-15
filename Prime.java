import java.util.*;
public class Prime {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		boolean flag = false;
		if(n>0)
		{
			for (int i = 2; i <= n / 2; ++i) 
	        {
	            if (n % i == 0) 
	            {
	                flag = true;
	                break;
	            }
	        }	
        if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
		}
		else
		{
			System.out.println("Please give Positive Real number as input");
		}
	}

}
