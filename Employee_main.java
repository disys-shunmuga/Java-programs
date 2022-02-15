import java.util.Scanner;
class Employee
{
	String emp_name, email_id,address;
	double salary;
	long Emp_no,mobile_no;
	void Emp_details(long eid, String ename, String Addr, long mno, String Email)
	{
		emp_name = ename;
		Emp_no = eid;
		address = Addr;
		mobile_no = mno;
		email_id = Email;
	}
	void Display()
	{
		System.out.println("The Employee Name is : "+ emp_name);
		System.out.println("The Employee Id is : "+ Emp_no);
		System.out.println("The Employee Address is : "+ address);
		System.out.println("The employee Mobile number is : "+ mobile_no);
		System.out.println("The Employee Email Id is : "+ email_id);
	}
}
class Programmer extends Employee
{
	double da,hra,pf,bp,sfc;
	void salcal(double bpay)
	{
		bp = bpay;
		da = bp * 0.97;
		hra = bp * 0.10;
		pf = bp * 0.12;
		sfc = bp * 0.001;
		salary = salary+da+hra-pf+sfc;
	}
	void Displays()
	{
		System.out.println("The employee basic Pay is : "+ bp);
		System.out.println("The employee DA is : "+ da);
		System.out.println("The employee HRA is : "+ hra);
		System.out.println("The employee pf is : "+ pf);
		System.out.println("The Staff fund club for employee is : "+sfc);
		System.out.println("The Employee Salary is : "+ salary);
	}
}
class Assistant_professor extends Employee
{
	double da,hra,pf,bp,sfc;
	void salcal(double bpay)
	{
		bp = bpay;
		da = bp * 0.97;
		hra = bp * 0.10;
		pf = bp * 0.12;
		sfc = bp * 0.001;
		salary = bp+da+hra-pf+sfc;
	}
	void Displays()
	{
		System.out.println("The employee basic Pay is : "+ bp);
		System.out.println("The employee DA is : "+ da);
		System.out.println("The employee HRA is : "+ hra);
		System.out.println("The employee pf is : "+ pf);
		System.out.println("The Staff fund club for employee is : "+sfc);
		System.out.println("The Employee Salary is : "+ salary);
	}
}
class  Associate_professor extends Employee
{
	double da,hra,pf,bp,sfc;
	void salcal(double bpay)
	{
		bp = bpay;
		da = bp * 0.97;
		hra = bp * 0.10;
		pf = bp * 0.12;
		sfc = bp * 0.001;
		salary = bp+da+hra-pf+sfc;
	}
	void Displays()
	{
		System.out.println("The employee basic Pay is : "+ bp);
		System.out.println("The employee DA is : "+ da);
		System.out.println("The employee HRA is : "+ hra);
		System.out.println("The employee pf is : "+ pf);
		System.out.println("The Staff fund club for employee is : "+sfc);
		System.out.println("The Employee Salary is : "+ salary);
	}
}
class Professor extends Employee
{
	double da,hra,pf,bp,sfc;
	void salcal(double bpay)
	{
		bp = bpay;
		da = bp * 0.97;
		hra = bp * 0.10;
		pf = bp * 0.12;
		sfc = bp * 0.001;
		salary = bp+da+hra-pf+sfc;
	}
	void Displays()
	{
		System.out.println("The employee basic Pay is : "+ bp);
		System.out.println("The employee DA is : "+ da);
		System.out.println("The employee HRA is : "+ hra);
		System.out.println("The employee pf is : "+ pf);
		System.out.println("The Staff fund club for employee is : "+sfc);
		System.out.println("The Employee Salary is : "+ salary);
	}
}
public class Employee_main {
	public static void main(String arg[])
	{
		String name, addrs,em;
		long no,mono;
		double bpays;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the name of the employee : ");
		name = sc.next();
		System.out.println("Enter the employee id : ");
		no = sc.nextLong();
		System.out.println("Enter the Address of the employee : ");
		addrs = sc.next();
		System.out.println("Enter the email id of the employee : ");
		em = sc.next();
		System.out.println("Enter the mobile number of the employee : ");
		mono = sc.nextLong();
		System.out.println("Enter the basic pay of the employee : ");
		bpays = sc.nextDouble();
		if(bpays > 0)
		{
			if(bpays <= 20000)
			{
				Programmer ep1 = new Programmer();
				ep1.Emp_details(no, name, addrs, mono, em);
				ep1.salcal(bpays);
				ep1.Display();
				System.out.println("The Employee is Programer");
				ep1.Displays();
			}
			else if(bpays >=21000 && bpays <= 35000)
			{
				Assistant_professor ep1 = new Assistant_professor();
				ep1.Emp_details(no, name, addrs, mono, em);
				ep1.salcal(bpays);
				ep1.Display();
				System.out.println("The Employee is Assistant_professor ");
				ep1.Displays();
			}
			else if(bpays >= 36000 && bpays <= 45000)
			{
				Associate_professor ep1 = new Associate_professor();
				ep1.Emp_details(no, name, addrs, mono, em);
				ep1.salcal(bpays);
				ep1.Display();
				System.out.println("The Employee is Associate_professor ");
				ep1.Displays();
			}
			else if(bpays >= 46000)
			{
				Professor ep1 = new Professor();
				ep1.Emp_details(no, name, addrs, mono, em);
				ep1.salcal(bpays);
				ep1.Display();
				System.out.println("The Employee is Professor");
				ep1.Displays();
			}
			else
			{
				System.out.println("Sorry ! enter the correct input");
			}
		}
		else
		{
			System.out.println("Salary is Invalid");
		}
		
	}

}
