import java.util.Scanner;
 class Manager 
{
	private String name="Manager";
	private double salary=50000.0;
	public double getSalary(){return salary;}
}
 class AdminOfficer 
{
	private String name="Admin Officer";
	private double salary=35000.0;
	public double getSalary(){return salary;}
}
class Salesman
{
	private String name="Salesman";
	private double salary=25000.0;
	public double getSalary(){return salary;}
}
public class Company{
	public static void main(String[]agrs){
		System.out.println("--Welcome to X company--");
		System.out.println("Enter the serial number you want to know");
		System.out.println("1. Manager salary");
		System.out.println("2. Admin Officer salary");
		System.out.println("3. Salesman salary");
		System.out.println("4. Company's given salary in total");
		Scanner sc = new Scanner(System.in);
		int serial = sc.nextInt();
		if(serial==1){
			Manager m = new Manager();
			System.out.println("Monthly salary = "+m.getSalary());
			System.out.println("Yearly salary = "+m.getSalary()*12);
		}
		if(serial==2){
			AdminOfficer a = new AdminOfficer();
			System.out.println("Monthly salary = "+a.getSalary());
			System.out.println("Yearly salary = "+a.getSalary()*12);
		}
		if(serial==3){
			Salesman s = new Salesman();
			System.out.println("Monthly salary = "+s.getSalary());
			System.out.println("Yearly salary = "+s.getSalary()*12);
		}
		if(serial==4){
			Manager m = new Manager();
			AdminOfficer a = new AdminOfficer();
			Salesman s = new Salesman();
			double salary = m.getSalary()+a.getSalary()+s.getSalary();
			System.out.println("Monthly salary = "+salary);
			System.out.println("Yearly salary = "+salary*12);
		}
	}
}