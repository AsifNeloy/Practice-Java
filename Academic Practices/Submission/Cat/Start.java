public class Start 
{
	
	public static void main(String [] args)
	{
		Cat ob = new Cat();
		ob.setName("Pussy");
		ob.setColor("White");
		ob.setHight(1.4);
		ob.setWeight(6);

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Cat cpp = new Cat("Citty","Black",1.2,4);

		cpp.showInfo();
	}
}