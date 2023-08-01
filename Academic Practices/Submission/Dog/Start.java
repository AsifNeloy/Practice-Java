public class Start 
{
	public static void main(String [] args)
	{
		Dog ob = new Dog();
		ob.setName("Tom");
		ob.setColor("White");
		ob.setHight(1.4);
		ob.setWeight(6);

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Dog cpp = new Dog("Bunny","Black",1.2,4);

		cpp.showInfo();
	}
}