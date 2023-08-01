import java.util.Scanner;
public class Task2{  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
System.out.print("Enter first String : ");
String st = sc.nextLine();
System.out.print("Enter second string : "); 
String sr = sc.nextLine(); 
System.out.println("The compare of two strings is shown below");  
System.out.println(st.compareTo(sr));  
}}