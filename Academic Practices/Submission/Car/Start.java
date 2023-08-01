public class Start 
{
	
	public static void main(String [] args)
	{
		Car ob = new Car();
		ob.setName("Toyota");
		ob.setColor("White");
		ob.setModel("G31");
		ob.setYearOfUse(2);
		ob.setOwnerName("Neloy");

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Car cpp = new Car("Alien","Black","e31",3,"Asif");

		cpp.showInfo();
	}
}