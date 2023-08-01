import java.util.Scanner;
public class Task7{  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
System.out.print("Enter phone number : ");
String st = sc.nextLine();
char ch=st.charAt(3); 
if(ch == '7'){System.out.println("Grameenphone");}
if(ch == '9'){System.out.println("Banglalink");}
if(ch == '8'){System.out.println("Robi");}
if(ch == '6'){System.out.println("Airtel");}
if(ch == '5'){System.out.println("Teletalk");}
}}