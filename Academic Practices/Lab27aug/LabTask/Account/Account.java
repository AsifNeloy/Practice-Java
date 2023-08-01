import java.util.Scanner;
public class Account{
	private String accName;
	private String acId;
	private int balance;
	Account(){
		//adding sender information here
		accName="Garbage";
		acId="garbage";
		balance=40000;
	};
	Account(String accName, String acId){
		this.accName=accName;
		this.acId=acId;
	}
	public void setAccName(String accName){this.accName=accName;}
	public void setAcId(String acId){this.acId=acId;}
	public void setBalance(int balance){this.balance = balance;}
	public String getAccName(){return accName;}
	public String getAcId(){return acId;}
	public int getBalance(){return balance;}
	public int deposit(int amount){
		balance +=amount;
		System.out.println("Your deposite amount : "+amount);
		System.out.println("Balance : "+balance);
		return balance;
	}
	public int withdraw(int amount){
		balance -=amount;
		System.out.println("Your withdraw amount : "+amount);
		System.out.println("Balance : "+balance);
		return balance;
	}
	public void showInfo()
	{
		System.out.println("Account Name :" + accName);
		System.out.println("Account id :" + acId);
		System.out.println("Balance :" + balance);
	}

	static Transaction transaction[] = new Transaction[100] ;
	static int totalNumberOfTransaction = 0;

	public void addTransaction(Account sender, Account receiver, int amount)
	{
		transaction[totalNumberOfTransaction] = new Transaction(sender , receiver,  amount);
		totalNumberOfTransaction++;
	}

	public void transfer(int amount, Account receiver){
		addTransaction(this, receiver, amount);
		int y = receiver.deposit(amount);
		System.out.println("Transfer Completed");
		System.out.println("Balance of "+this.accName+" is: "+this.balance);
		System.out.println("Balance of "+receiver.accName+" is: "+receiver.balance);
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Account sender = new Account();
		Account receiver = new Account();
		sender.setAccName("Asif");
		sender.setAcId("2296");
		sender.setBalance(500000);
		receiver.setAccName("Neloy");
		receiver.setAcId("4499");
		receiver.setBalance(10000);
		START:
		while(true){
			System.out.println("\n\tWelcome to Sonali Bank LTD");
			System.out.println("What do you want to do?");
			System.out.println("1. Deposit \n2. Withdraw \n3. Transaction\n4. View information\n5. Continue\n6. Exit");
			System.out.print("Enter choice : ");
			int user = input.nextInt();
			switch(user)
			{
			case 1:
			System.out.print("\nEnter deposit amount : ");
			int x = input.nextInt();
			sender.deposit(x);			
			break;

			case 2:
			System.out.print("\nEnter withdraw amount : ");
			int w = input.nextInt();			
			sender.withdraw(w);
			break;

			case 3:
			System.out.print("\nEnter transfer amount : ");
			int h = input.nextInt();
			sender.transfer(h,receiver);
			break;

			case 4 :
			System.out.println("\nSender Account information");
			sender.showInfo();
			System.out.println("Receiver Account information");
			receiver.showInfo();
			break;

			case 5 :
			continue START;

			case 6:
			break START;
			}
		}
	}
}