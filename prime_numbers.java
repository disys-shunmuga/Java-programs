package primenumber;
import java.util.*;
public class prime_numbers  {
	
	public static void main(String[] args) {
		// Write your code here
        int n;
        int ser=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
                ser = 3*i+2;
            	if(ser%4!=0)
            	{
                	System.out.print(ser+" ");
            	}
            	else
            	{
            		n=n+1;
            	}
            
        }

	}
}
