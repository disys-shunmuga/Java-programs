import java.util.Scanner;
class Electricitybill 
 { 
      private int customerNo; 
      private String name;
      private String Tarrif;
      private double previous_unit,current_unit; 
      double bill_amount;
      double units;
      void setData(int num,String cname,String tarrif,double previousunit,double currentunit) 
      { 
          customerNo = num; 
          name = cname ; 
          previous_unit = previousunit;
          current_unit = currentunit;
          Tarrif = tarrif;
          units = current_unit - previous_unit;
          
      } 
      void show() 
      {    
            System.out.println("Customer Number : " + customerNo); 
            System.out.println("Customer Name : " + name); 
            System.out.println("Tarrif Name : " + Tarrif);
            System.out.println("units Name : " + units);
            System.out.println("Total amount to pay : " + bill_amount);
            
            
      } 
      void bill_calculate( ) 
      { 
    	  String tarrif1 = "Domestic";
    	  String tarrif2= "Comercial";
    	  if(Tarrif.equals(tarrif1))
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
    	  
    	  else if(Tarrif.equals(tarrif2))
    	  {
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
      }
   }
 }; 
    
   public class Compute_Ebill 
 { 
         public static void main(String[] args) 
    {   
         Electricitybill b = new Electricitybill();
         int cno;
         String c_name,tarrifs;
         double pu,cu;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Consumer number : ");
         cno = sc.nextInt();
         System.out.println("Enter the Consumer name : ");
         c_name = sc.next();
         System.out.println("Enter the Tarrifs mode : ");
         tarrifs = sc.next();
         System.out.println("Enter the Previous unit : ");
         pu = sc.nextDouble();
         System.out.println("Enter the Current unit : ");
         cu = sc.nextDouble();
         b.setData(cno,c_name,tarrifs,pu,cu); 
         b.bill_calculate(); 
         b.show( );  
    }
 }
   
 
