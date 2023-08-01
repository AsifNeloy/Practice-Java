public class Dog
{
	private String name;
	private String color;
	private double hight;
	private double weight;

	public Dog(){System.out.println("Empty Constructor\n");}
	public Dog(String name, String color, double hight, double weight)
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
}