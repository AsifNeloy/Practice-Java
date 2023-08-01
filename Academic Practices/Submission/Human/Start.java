public class Start 
{
	public static void main(String [] args)
	{
		Human ob = new Human();
		ob.setName("Neloy");
		ob.setColor("White");
		ob.setHight(5.11);
		ob.setWeight(32);
		ob.setAge(20);
		ob.setDateOfBirth("11-12-99");

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Human cpp = new Human("Asif","Black",5.45,26,24,"12-11-20");

		cpp.showInfo();
	}
}