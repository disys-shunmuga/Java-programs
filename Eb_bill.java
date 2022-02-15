import java.util.Scanner;
public class Eb_bill {
	public static void main(String args[])
    {
        long consumer_no;
        double previous_unit,Current_unit;
        String consumer_name;
        String Tarrif;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Consumer number : ");
        consumer_no = sc.nextLong();
        System.out.println("Enter the Consumer Name : ");
        consumer_name = sc.next();
        System.out.println("Enter the Previous unit : ");
        previous_unit = sc.nextLong();
        System.out.println("Enter the Current unit : ");
        Current_unit = sc.nextLong();
        System.out.println("Enter the Tarrif : ");
        Tarrif = sc.next();
        String tarrif1 = "Domestic";
        String tarrif2 = "Comercial";
        double bill_amount = 0;
        if(Tarrif.equals(tarrif1))
        {
            double units = Current_unit - previous_unit;
            if(units > 0)
            {
            if(units <=100)
            {
                bill_amount = units*1;
            }
            else if(units>=101 && units<=200 )
            {
                bill_amount = units*2.50;
            }
            else if(units >=201 && units <=500)
            {
                bill_amount = units*4;
            }
            else if(units>=501)
            {
                bill_amount = units*6;
            }
            else
            {
                System.out.println("Enter the correct units");
            }
            
        
       
        }
        else
        {
            System.out.println("There is no Electric charge");
        }
        }
            
        else if(Tarrif.equals(tarrif2))
        {
        	double units = Current_unit - previous_unit;
            if(units > 0)
            {
            if(units <=100)
            {
                bill_amount = units*2;
            }
            else if(units>=101 && units<=200 )
            {
                bill_amount = units*4.50;
            }
            else if(units >=201 && units <=500)
            {
                bill_amount = units*6;
            }
            else if(units>=501)
            {
                bill_amount = units*7;
            }
            else
            {
                System.out.println("Enter the correct units");
            }            
        }
        else
        {
            System.out.println("There is no Electric charge");
        }
        }
            
        else
        {
            System.out.println("please enter the correct tarrif");
        }
        
        System.out.println("Consumer number\tConsumer name \t\t Tarrif \t Bill amount ");
        System.out.println(consumer_no + "\t\t" +  consumer_name + "\t\t" + Tarrif + "\t\t" + bill_amount);
        
        }

}
