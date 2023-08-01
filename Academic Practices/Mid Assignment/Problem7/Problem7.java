import java.util.Scanner;
public class Problem7
{
	public static void main(String []args)
	{
		System.out.print("Enter the number of sales people = ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=0;
		double arr[] = new double[num];
		while(i<num){
			System.out.print("Enter gross sale of number "+(i+1)+" sale people = ");
			double n = sc.nextDouble();
			arr[i]=200+(n*0.09);
			i++;
		}
		for(int j=0;j<num;j++){
			System.out.println("The income of number "+(j+1)+" sale people is "+arr[j]+"$");
		}
	}
}