import java.util.Scanner;

public class Problem1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter days to count : ");
		int input = sc.nextInt();
		int year = input/365;
		int week = (input - (year*365))/7;
		int day = input - ((year*365)+(week*7));
		System.out.println("Years = "+year+" Weeks = "+week+" Days = "+day);
	}
}