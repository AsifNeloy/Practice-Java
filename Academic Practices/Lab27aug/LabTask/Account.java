import java.util.Scanner;
public class Account
{
static Transaction transaction[] = new Transaction[100] ;
static int totalNumberOfTransaction = 0;
private String accName;
private String acid;
private int balance;
Account ()
{
accName = "Abir12333";
acid = "20-43206-1";
balance = 123;
}
Account(String accName,String acid,int balance)
{
accName = accName;
acid = acid;
balance = balance;
}
public void setAccName(String accName){this.accName = accName;}
public void setAcid(String acid){this.acid = acid;}
public void setBalance(int balance){this.balance = balance;}
public String getAccName(){return accName;}
public String getAcid(){return acid;}
public int getBalance(){return balance;}
public int deposit(int amount)
{
balance += amount;
System.out.println("After the deposit in the "+accName+" account the balance :"+balance);
return balance;
}
public int withdraw(int amount)
{
if(amount > balance)return -1;
else{
balance -= amount;
System.out.println("After the withdraw in the "+accName+" account the balance :"+balance);
}
return balance;
}
public void addTransaction(Account sender, Account receiver, int amount)
{
transaction[totalNumberOfTransaction] = new Transaction(sender , receiver,  amount);
totalNumberOfTransaction++;
}
public void showAllTransaction()
{
for(int i = 0; i<totalNumberOfTransaction; i++)
{
transaction[i].showInfo();
}
}
public void transfer(int amount, Account receiver)
{
int x = this.withdraw(amount);
if(x == -1) System.out.println("Insufficient balance.Try again later...");
if(x != -1)
{
addTransaction(this, receiver, amount);
int y = receiver.deposit(amount);
System.out.println("Final status after transfer...");
System.out.println("Total Balance of "+this.accName+" is: "+this.balance);
System.out.println("Total Balance of "+receiver.accName+" is: "+receiver.balance);
}
}
public void showInfo()
{
System.out.println("Account Name :" + accName);
System.out.println("Account id :" + acid);
System.out.println("Balance :" + balance);
}
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
Account sender = new Account();
Account receiver = new Account();
sender.setAccName("Karim12");
sender.setAcid("K12");
sender.setBalance(100000);
receiver.setAccName("Abir30");
receiver.setAcid("A30");
receiver.setBalance(5000);
loop : while(true)
{
System.out.println("Press 1 for deposit \nPress 2 for withdraw \nPress 3 for transiction\nPress 4 for showing info\nPress 5 for exit...");
int x = input.nextInt();
switch(x)
{
case 1:
System.out.println("To which account you want to deposit? Press 1 for sender / 2 for receiver...");
int a = input.nextInt();
System.out.println("What amount you want to deposit?");
int b = input.nextInt();
if(a == 1)
{
sender.deposit(b);
}else{
receiver.deposit(b);
}
System.out.println();
break;
case 2:
System.out.println("From which account you want to withdraw? Press 1 for sender / 2 for receiver...");
int c = input.nextInt();
System.out.println("What amount you want to withdraw?");
int d = input.nextInt();
if(c == 1)
{
int e = sender.withdraw(d);
if(e == -1) System.out.println("Insufficient balance.Try again later...");
}else{
int f = receiver.withdraw(d);
if(f == -1) System.out.println("Insufficient balance.Try again later...");
}
System.out.println();
break;
case 3:
System.out.println("From which account you want to transfer? Press 1 for sender / 2 for receiver...");
int g = input.nextInt();
System.out.println("What amount you want to transfer?");
int h = input.nextInt();
System.out.println();
if(g == 1)
{
sender.transfer(h,receiver);
}else {
receiver.transfer(h,sender);
}
System.out.println();
break;
case 4 :
   System.out.println(".....Sender account.....");
sender.showInfo();
System.out.println(".....receiver account.....");
receiver.showInfo();
System.out.println();
break;
case 5 :
break loop;
}
}
sender.showAllTransaction();
}
}
 class Transaction
{
	Account sender;
	Account receiver;
	int amount;
	Transaction()
{
sender = new Account();
receiver = new Account();
amount = 1000;
}
Transaction(Account sender, Account receiver, int amount)
{
this.sender = sender;
this.receiver = receiver;
this.amount = amount;
}
public void setSender(Account sender){this.sender = sender;}
public void setReceiver(Account receiver){this.receiver = receiver;}
public void showInfo()
{
System.out.println("....Transaction history....");
System.out.println("Transacted amount :" +amount);
System.out.println("Sender Account name :" +sender.getAccName());
System.out.println("Sender Account id :" +sender.getAcid());
    System.out.println("Receiver Account name :" +receiver.getAccName());
System.out.println("Receiver Account id :" +receiver.getAcid());
System.out.println();
}
}