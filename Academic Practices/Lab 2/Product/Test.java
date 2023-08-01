public class Test {
	public static void main(String[]args)
	{
		Product o1 = new Product("Olive oil",3,45.25);
		o1.showInfo();
		System.out.println("Total value of product = "+o1.calculation());

		Product o2 = new Product("Chicken",5,155.85);
		o2.showInfo();
		System.out.println("Total value of product = "+o2.calculation());
	}
}