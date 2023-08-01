import java.util.Scanner;

public class Problem2
{
	public static void main(String []args)
	{
		int character=0,digit=0,spChar=0,a;
		char g;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something to check ");
		String st = sc.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char c = st.charAt(i);
			if(c>='0' && c<='9'){digit++;}
			if(c>='a' && c<='z'){character++;}
			if(c== '\"' || c=='\'' || c=='\\' || c=='\t' || c=='\b' || c=='\r' || c=='\f' || c=='\n')
				{spChar++;}
		}
		System.out.println("Alphabets = "+character+" Digits = "+digit+" Special character = "+spChar);
	}
}