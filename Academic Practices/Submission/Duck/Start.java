public class Start 
{
	
	public static void main(String [] args)
	{
		Duck ob = new Duck();
		ob.setName("Mose");
		ob.setColor("White");
		ob.setHight(1.4);
		ob.setWeight(6);

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Duck cpp = new Duck("Bunty","Black",1.2,4);

		cpp.showInfo();
	}
}