
public class Transaction extends Account{
	 Account sender;
	 Account receiver;
	 int amount;
	
	 Transaction(){};
	 Transaction(Account sender, Account receiver, int amount){
	 	this.amount=amount;
	 	this.receiver=receiver;
	 	this.sender=sender;
	 }
	 public void setSender(Account sender){this.sender = sender;}
	 public void setReceiver(Account receiver){this.receiver = receiver;}
	
	 public void showInfo(){
		System.out.println("Transacted amount :" +amount);
		System.out.println("Sender Account name :" +sender.getAccName());
		System.out.println("Sender Account id :" +sender.getAcId());
    	System.out.println("Receiver Account name :" +receiver.getAccName());
		System.out.println("Receiver Account id :" +receiver.getAcId()+"\n");
	 }
}