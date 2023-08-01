public class Cat
{
	private String name;
	private String color;
	private double hight;
	private double weight;

	public Cat(){System.out.println("Empty Constructor");}
	public Cat(String name, String color, double hight, double weight)
	{
		this.name = name;
		this.color = color;
		this.hight = hight;
		this.weight = weight;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setColor(String c){color = c;}
	public String getColor(){return color;}

	public void setHight(double h){hight = h;}
	public double getHight(){return hight;}

	public void setWeight(double w){weight = w;}
	public double getWeight(){return weight;}


	public void showInfo()
	{
		System.out.println("Name = "+getName());
		System.out.println("Color = "+getColor());
		System.out.println("Height = "+getHight());
		System.out.println("Weight = "+getWeight());
	}

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