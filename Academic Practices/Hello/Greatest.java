import java.util.Scanner;

public class Greatest
{
	public static void main(String [] args)
	{
		Scanner grt = new Scanner (System.in);
		System.out.println("Enter Numbers : ");
		int num, large=-1,i=1;
		while(i>0){
			num = grt.nextInt();
			if(num>large)
				{large = num;}
			i = num;
		}
		System.out.println("Largest Number = "+large);
	}
}