import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class string
{
		String str,str1;
		int ch,i,j;
		ArrayList<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		void operations()
		{
			do
			{
				System.out.println("\n");
				System.out.println(" 1.Appemd \n 2.Insert at particular index \n 3.Search \n 4.List of string starting with the letter \n "
						+ "5.Size \n 6.Remove \n 7.Sort \n 8.Display ");
				System.out.println("Enter your Choice : ");
				ch = sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						System.out.println("Enter the string ");
						 str = sc.next();
						 array.add(str);
						 //n=n+1;
						 break;
					}
					case 2:
					{
						System.out.println("Enter the string ");
						str=sc.next();
						System.out.println("Specify the index/position to insert");
						i=Integer.parseInt(sc.next());
						array.add(i-1,str);
						System.out.println("The array list has following elements: "+array+"\n");
						break;
					}
					case 3:
					{
						System.out.println("Enter the string to search ");
						str=sc.next();
						j=array.indexOf(str);
						if(j==-1)
						System.out.println("Element not found");
						else
						System.out.println("Index of: "+ str +" is"+ j + "\n");
						break;
					}
					case 4:
					{
						System.out.println("Enter the character to List string that starts with specified character");
						str=sc.next();
						for(i=0;i<(array.size()-1);i++)
						{
						str1=array.get(i);
						if(str1.startsWith(str))
						{
						System.out.println(str1);
						}
						}
						break;
					}
					case 5:
					{
						System.out.println("Size of the list "+ array.size()+"\n");
						break;
					}
					case 6:
					{
						System.out.println("Enter the element to remove");
						str=sc.next();
						if(array.remove(str))
						{
						System.out.println("Element Removed"+str+"\n");
						}
						else
						{
						 System.out.println("Element not present \n ");
						}
						 break;
					}
					case 7:
					{
						Collections.sort(array);
						System.out.println("The array list has following elements:"+array+"\n");
						break;
					}
					case 8:
					{
					 System.out.println("The array list has following elements:"+array+"\n");
					 break;
					}
				
				}
			}while(ch<=8);
		}
}
public class String_operation {
	public static void main(String args[])
	{
		string s = new string();
		s.operations();
	}
	
}
