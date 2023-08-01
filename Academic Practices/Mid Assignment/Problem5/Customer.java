import java.util.Scanner;

public class Customer
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Products ob = new Products();
		System.out.print("\nEnter product number : ");
		int a = sc.nextInt();
		ob.setProductNo(a);
		ob.setPrice();
		ob.setProductName();
		System.out.print("\nEnter quantity : ");
		int c = sc.nextInt();
		ob.setQty(c);
		ob.showInfo();
		System.out.println("Bill in total = "+ob.calculation());
	}
}