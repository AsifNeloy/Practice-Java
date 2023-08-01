import Account.*;
import AddressBook.*;
import Book.*;
import Contact.*;
import Mobile.*;
import Library.*;
import Student.*;
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		START:
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t  WELCOME");
		System.out.println("\t************\n");
		System.out.println("\tChoose an option");
		System.out.println("\t1. Mobile");
		System.out.println("\t2. Student");
		System.out.println("\t3. Account");
		System.out.println("\t4. Librarian");
		System.out.println("\t0. Exit");
		System.out.println("\t************\n");

		Book b1 = new Book("Paraiste","Asif","01","Nobel",3);
		Book b2 = new Book("Oceans","Hossian","02","Drama",5);
		Book b3 = new Book("Moon","Neloy","03","Comedy",9);
		Book b4 = new Book("Cprogramming","Java","04","Educational",7);
		Book b5 = new Book("Adjoint Matrix","Shohidul Islam","05","Educational",5);

		Contact c1 = new Contact("Asif","001",21,"01776670525",'M');
		Contact c2 = new Contact("Saida","002",20,"01432170525",'F');
		Contact c3 = new Contact("Rishad","003",21,"01776673215",'M');

		System.out.print("Enter Choice = ");
		int firstInput = sc.nextInt();
		switch(firstInput){
			case 1:
			System.out.println("\t\n************\n");
			Mobile mb=new Mobile("Asif","01776670525",150.0,"Android",true);
			mb.showInfo();
			AddressBook ad = new AddressBook("Asif","GP");
			ad.addContact(c1);
			ad.addContact(c2);
			ad.addContact(c3);
			MOBILE:
			while(true){
			System.out.println("\t1. Recharge ");
			System.out.println("\t2. Call Someone ");
			System.out.println("\t3. AddressBook ");
			System.out.println("\t0. Exit");

			System.out.print("Enter your choice = ");
			int inputMobile = sc.nextInt();
			
			
			switch(inputMobile){
				
				case 1:
				System.out.print("Enter recharge amount = ");
				int rechar = sc.nextInt();
				mb.recharge(rechar);
				break;

				case 0:
				break MOBILE;

				case 2:
				ad.showAllContactInfo();
				System.out.print("Enter call amount(minutes) = ");
				int callAmount = sc.nextInt();
				mb.callSomeone(callAmount);
				break;

				case 3:
				ad.showAllContactInfo();
				break;
				}
			
			}
			break;

			case 2:
			System.out.println("\t\n************\n");
			STUDENT:
			while(true){

			Student s1 = new Student("Asif","42996",3000);
			
			System.out.println("\t1. Borrow Book");
			System.out.println("\t2. Show Borrowed Info");
			System.out.println("\t3. Deposite Book");
			System.out.println("\t4. Delay Deposite");
			System.out.println("\t0. Exit");
			System.out.print("Enter choice = ");
			int studChoice = sc.nextInt();
			switch(studChoice){
				case 0:
				break STUDENT;

				case 1:
				System.out.print("Enter Book Serial Number = ");
				int bookSName = sc.nextInt();
				if(bookSName==1){s1.borrowBook(b1);}
				else if(bookSName==2){s1.borrowBook(b2);}
				else if(bookSName==3){s1.borrowBook(b3);}
				else if(bookSName==4){s1.borrowBook(b4);}
				else if(bookSName==5){s1.borrowBook(b5);}
				else{System.out.println("There is only 5 books. Choose between 1-5");
					break;
					}
				break;

				case 2:
				s1.showBorrowedInfo();
				break;

				case 3:
				System.out.print("Enter book serial number = ");
				int depBookNum = sc.nextInt();
				if(depBookNum==1){
					System.out.print("Enter borrowed days = ");
					int borrowDay1 = sc.nextInt();
					s1.depositeBook(b1,borrowDay1);
				}
				else if(depBookNum==2){
					System.out.print("Enter borrowed days = ");
					int borrowDay2 = sc.nextInt();
					s1.depositeBook(b2,borrowDay2);
				}
				else if(depBookNum==3){
					System.out.print("Enter borrowed days = ");
					int borrowDay3 = sc.nextInt();
					s1.depositeBook(b3,borrowDay3);
				}

				else if(depBookNum==4){
					System.out.print("Enter borrowed days = ");
					int borrowDay4 = sc.nextInt();
					s1.depositeBook(b4,borrowDay4);
				}
				else if(depBookNum==5){
					System.out.print("Enter borrowed days = ");
					int borrowDay5 = sc.nextInt();
					s1.depositeBook(b5,borrowDay5);
				}
				else{System.out.println("There is only 5 books. Choose between 1-5");
					break;
					}
					break;
				case 4:
				s1.delayDeposite();
				break;
				}
			}
			break;
			case 3:
			System.out.println("\t\n************\n");
			ACCOUNT:
			while(true){
			Account a = new Account("Asif","42996",3000);
			System.out.println("\t\n**************\n");
			System.out.println("\t1. Deposite");
			System.out.println("\t2. Withdraw");
			System.out.println("\t3. Transfer");
			System.out.println("\t4. Show All Transaction");
			System.out.println("\t0. Exit");

			System.out.print("Enter your choice = ");
			int accountChoice = sc.nextInt();
			switch(accountChoice){
				case 0:
				break ACCOUNT;

				case 1:
				System.out.print("Enter deposite amount = ");
				int depAmount = sc.nextInt();

				a.deposite(depAmount);
				break;

				case 2:
				System.out.print("Enter withdraw amount = ");
				int widAmount = sc.nextInt();

				a.withdraw(widAmount);
				break;

				case 3:
				
				System.out.print("\nEnter Transfer Amount = ");
				int traAmount = sc.nextInt();
				
				Account b = new Account("Rishad","431",3000);
				a.transfer(traAmount,b);
				a.showInfo();
				b.showInfo();
				break;

				case 4:
				a.showAlltransaction();
				break;			
				}
			}
			break;
			case 4:
			System.out.println("\t\n************\n");
			LIBRARY:
			while(true){
			Library l = new Library("Shahitto Kendro","42/c, Mogbazar");
			l.addNewBook(b1);
			l.addNewBook(b2);
			l.addNewBook(b3);
			l.addNewBook(b4);
			l.addNewBook(b5);
			System.out.println("\t1. Show Info");
			System.out.println("\t2. Delete Book");
			System.out.println("\t3. Add New Book Copy");
			System.out.println("\t0. Exit");

			System.out.print("Enter choice = ");
			int libInput = sc.nextInt();
			switch(libInput){
				
				case 0:
				break LIBRARY;

				case 1:
				l.showLibInfo();
				break;

				case 2:
				System.out.print("Enter book number to delete = ");
				int bookNum = sc.nextInt();
				if(bookNum==1){l.deleteBook(b1);}
				else if(bookNum==2){l.deleteBook(b2);}
				else if(bookNum==3){l.deleteBook(b3);}
				else if(bookNum==4){l.deleteBook(b4);}
				else if(bookNum==5){l.deleteBook(b5);}
				else{System.out.println("There is only 5 books. Choose between 1-5");
					break;
					}
				break;

				case 3:
				System.out.print("Enter book serial number = ");
				int bookSerialName = sc.nextInt();
				if(bookSerialName==1){
					System.out.print("Enter copy amount = ");
					int bookCopyNum1 = sc.nextInt();
					l.addNewBookCopy(b1,bookCopyNum1);
				}
				else if(bookSerialName==2){
					System.out.print("Enter copy amount = ");
					int bookCopyNum2 = sc.nextInt();
					l.addNewBookCopy(b2,bookCopyNum2);
				}
				else if(bookSerialName==3){
					System.out.print("Enter copy amount = ");
					int bookCopyNum3 = sc.nextInt();
					l.addNewBookCopy(b3,bookCopyNum3);
				}
				else if(bookSerialName==4){
					System.out.print("Enter copy amount = ");
					int bookCopyNum4 = sc.nextInt();
					l.addNewBookCopy(b4,bookCopyNum4);
				}
				else if(bookSerialName==5){
					System.out.print("Enter copy amount = ");
					int bookCopyNum5 = sc.nextInt();
					l.addNewBookCopy(b5,bookCopyNum5);
				}
				else{System.out.println("There is only 5 books. Choose between 1-5");
					break;
					}
				break;
				}
			}
			break;

			case 0:
			break START;

		}
		
	}
		

		

		/*System.out.println("\n**************\n");

		Contact ob=new Contact("Asif","4299",21,"01776670525",'M');
		ob.showPersonInfo();
		ob.detectMobileOperator();

		System.out.println("\n**************\n");

		Book b1 = new Book("Paraiste","Asif","01","Nobel",3);
		Book b2 = new Book("Oceans","Hossian","02","Drama",5);
		Book b3 = new Book("Moon","Neloy","03","Comedy",9);
		b1.showInfo();
		b2.addBookCopy(5);
		b2.showInfo();
		b3.showTotalBookInfo();*/


	}
}