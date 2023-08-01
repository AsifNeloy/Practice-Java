import java.util.Scanner;
public class Problem8
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word = ");
		String st = sc.nextLine();
		for(int i=0;i<st.length();i++){
			char a = st.charAt(i);
			if(a>='0' && a<='9'){System.out.println("Only letters are accepted");}
		}
	}
}