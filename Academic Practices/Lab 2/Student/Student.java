public class Student
{
	private String name;
	private String id;
	private String dept;
	private float cgpa;

	public Student(){System.out.println("\n-Student Information-\n");}
	public Student(String name, String id, String dept,float cgpa){
		this.name = name;
		this.id= id;
		this.dept= dept;
		this.cgpa= cgpa;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setId(String i){id = i;}
	public String getId(){return id;}

	public void setDept(String d){dept = d;}
	public String getDept(){return dept;}

	public void setCgpa(float c){cgpa = c;}
	public float getCgpa(){return cgpa;}

	public void showInfo(){
		System.out.println("Name :"+getName());
		System.out.println("Name :"+getId());
		System.out.println("Name :"+getDept());
		System.out.println("Name :"+getCgpa());
	}

}