import java.util.Scanner;
class CSEDept
{
	private int credit;
	public CSEDept(){
		System.out.println("--CSE DEPARTMENT--");
		System.out.println("Offered courses :");
		System.out.println("1. Introduction to programming");
		System.out.println("2. Physics 1");
		System.out.println("3. Math 1");
		System.out.println("4. English 1");
		System.out.println("5. Bangladesh Studies");
		System.out.println("6. Computer Aid Designing");
		System.out.println("7. DC");
	}
	public void courseCount(){
		int i=1;
		while(i>0){
			System.out.print("Enter the serial number of course you want to take : ");
			Scanner sc = new Scanner(System.in);
			int serial = sc.nextInt();
			if(serial==1){credit= credit+3;}
			if(serial==2){credit= credit+4;}
			if(serial==3){credit= credit+3;}
			if(serial==4){credit= credit+3;}
			if(serial==5){credit= credit+3;}
			if(serial==6){credit= credit+1;}
			if(serial==7){credit= credit+4;}
			System.out.println("Enter 0 to stop");
			i=serial;
		}
	}
	public int getCredit(){return credit;}
}
public class Registration
{
	public static void main(String[]agrs)
	{
		CSEDept ob = new CSEDept();
		ob.courseCount();
		if(ob.getCredit()<15){System.out.println("You must take 5 courses or 15 credits");}
		else{System.out.println("Total credit taken = "+ob.getCredit());}

	}
}