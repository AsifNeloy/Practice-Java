
class Person{
	protected String name;
	protected String email;
	Person(){System.out.println("Printing person.......");}
	Person(String name, String email){
		this.name=name;
		this.email=email;
	}
	public void showInfo(){
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
	}
}
class Student extends Person{
	protected String studentId;
	protected String admissionDate;
	Student(){System.out.println("Printing student.......");}
	public void setStudent(String name, String email, String studentId, String admissionDate){
		
		this.studentId=studentId;
		this.admissionDate=admissionDate;
		this.name=name;
		this.email=email;
	}
	public void showStudent(){
		
		System.out.println("Id : "+studentId);
		System.out.println("Admision Date : "+admissionDate);
		super.showInfo();
	}
}
class Teacher extends Person{
	protected String employeeId;
	protected String joiningDate;
	Teacher(){System.out.println("Printing teacher.......");}
	public void setTeacher(String name, String email, String employeeId, String joiningDate){
		this.name=name;
		this.email=email;
		this.employeeId=employeeId;
		this.joiningDate=joiningDate;
	}
	public void showTeacher(){
		
		System.out.println("Id : "+employeeId);
		System.out.println("Joining Date : "+joiningDate);
		super.showInfo();
	}
}
public class Start{
	public static void main(String []agrs){
		Student ob1 = new Student();
		ob1.setStudent("Asif Neloy","exp@gmail.com","20-42996-1","11/12/19");
		ob1.showStudent();

		Teacher ob2 = new Teacher();
		ob2.setTeacher("Gourob Akash","exp@gmail.com","9961","12/1/18");
		ob2.showTeacher();

	}
}
