import java.util.Scanner;

public class Account
{
	private int number;
	private String name;
	private String typeOfAccount;
	Scanner sc = new Scanner(System.in);
	public Account(){System.out.println("---Enter your information---");}
	
	public void setNumber(){
		int n  = sc.nextInt();
		number = n;
	}
	public int getNumber(){return number;}

	public void setName(){
		String nm = sc.nextLine();
		name = nm;
	}
	public String getName(){return name;}

	public void setTypeOfAccount(){
		String t  = sc.nextLine();
		typeOfAccount = t;
	}
	public String getTypeOfAccount(){return typeOfAccount;}

	public void showInfo(){
		System.out.println("Account number : "+getNumber());
		System.out.println("Account name : "+getName());
		System.out.println("Account Type : "+getTypeOfAccount());
	}

	public static void main(String []args)
	{
		Account ob = new Account();
		
		System.out.println("Enter account number : ");
		ob.setNumber();
		System.out.println("Enter account name : ");
		ob.setName();
		System.out.println("Enter account type : ");
		ob.setTypeOfAccount();
		ob.showInfo();
		Scanner c = new Scanner(System.in);

		double balance=0.0;
		System.out.print("Enter ammount for deposite = ");
		double deposite = c.nextDouble();
		balance=deposite;
		System.out.println("Balance = "+balance);
		System.out.print("Enter ammount for withdraw = ");
		double withdraw = c.nextDouble();
		balance=balance-withdraw;
		System.out.println("Balance = "+balance);
	}
}