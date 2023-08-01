import java.util.Scanner;

public class Problem3
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double city1[] = new double[7];
		double city2[] = new double[7];
		System.out.println("Enter temperature of first city for a week :");
		for(int i=0;i<7;i++)
		{
			double st = sc.nextDouble();
			city1[i]=st;
		}
		System.out.println("Enter temperature of second city for a week :");
		for(int j=0;j<7;j++)
		{
			double st = sc.nextDouble();
			city2[j]=st;
		}
		System.out.println("Temperature of first city for a week :");
		for(int i=0;i<7;i++)
		{
			System.out.println("Day "+(i+1)+" = "+city1[i]);
		}
		System.out.println("Temperature of second city for a week :");
		for(int i=0;i<7;i++)
		{
			System.out.println("Day "+(i+1)+" = "+city2[i]);
		}
	}
}