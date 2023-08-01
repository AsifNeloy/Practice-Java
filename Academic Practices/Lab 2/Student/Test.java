public class Test
{
	public static void main(String []args)
	{
		Student ob = new Student();
		ob.setName("Neloy");
		ob.setId("20-42996-1");
		ob.setDept("CSE");
		ob.setCgpa(3.95F);
		

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Student cpp = new Student("Asif","18-32948-1","BBA",3.45F);

		cpp.showInfo();
	}
}
