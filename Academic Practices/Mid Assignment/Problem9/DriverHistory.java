import java.util.Scanner;
public class DriverHistory
{
	public static void main(String[]agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter trip count : ");
		int trip = sc.nextInt();
		double miPerGln[]= new double[trip];
		int i=0;
		while(i<trip)
		{
			System.out.println("For trip "+(i+1));
			System.out.print("Enter miles count : ");
			double miles = sc.nextDouble();
			System.out.print("Enter gallons count : ");
			double gallons = sc.nextDouble();
			miPerGln[i]=miles/gallons;
			i++;
		}
		for(int j=0;j<trip;j++)
		{
			System.out.println((j+1)+" no trip, miles per gallons used = "+miPerGln[j]);
		}
	}
}