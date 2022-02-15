import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		int n;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the numer : ");
			n = sc.nextInt();
		if(n>0)
		{
		    for(int i=1;i<=n;i++)
    		{
			    fact = fact*i;
		    }
		    System.out.println("The Factorial of the number "+n+" is : "+fact);
		    
		}
		else
		{
		    System.out.println("Please enter the Positive number");
		}
		
	}

}
