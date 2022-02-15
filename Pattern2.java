package pattern2;
import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j*=2)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		
	}

}
