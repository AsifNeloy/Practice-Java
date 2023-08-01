import java.util.Scanner;
public class Task1{  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String st = sc.nextLine();
System.out.print("Enter index number to search : "); 
int n = sc.nextInt(); 
char ch=st.charAt(n); 
System.out.println("The character in the index is "+ch);  
}}