import java.util.Scanner;
import java.util.Arrays;
public class Task4{  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String st = sc.nextLine();
System.out.println("The reverse is shown below");
StringBuffer sb2 = new StringBuffer(st);  
System.out.println(sb2.reverse());  
}}