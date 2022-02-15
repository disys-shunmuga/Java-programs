package pattern;
import java.util.Scanner;
public class Pattern {
	public static void main(String args[])throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
			int n;
			System.out.print("Enter the number of rows : ");
			n = sc.nextInt();
			for(int i= 1;i<=n;i++)
			{
				for(int j=1;j<=2*n;j++)
				{
					if(j==n+1)
					{
						continue;
					}
					int k=(j<n+1)?j:2*n-j+1;
					if(k>=n+1-i) {
						int x=(int)Math.pow(2,(i+k-n-1));
						System.out.printf("%3d",x);
					}
					else
					{
						System.out.print("   ");
					}
					System.out.print("   ");
				}
				System.out.println();
			}
	}
}

                                                                       
