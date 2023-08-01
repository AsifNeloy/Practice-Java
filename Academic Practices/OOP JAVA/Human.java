public class Human
{
	private String name;
	private String color;
	private double hight;
	private double weight;
	private double age;
	private String dateOfBirth;

	public Human(){System.out.println("Empty Constructor");}
	public Human(String name, String color, double hight, double weight, double age, String dateOfBirth)
	{
		this.name = name;
		this.color = color;
		this.hight = hight;
		this.weight = weight;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setColor(String c){color = c;}
	public String getColor(){return color;}

	public void setHight(double h){hight = h;}
	public double getHight(){return hight;}

	public void setWeight(double w){weight = w;}
	public double getWeight(){return weight;}

	public void setAge(double a){age = a;}
	public double getAge(){return age;}

	public void setDateOfBirth(String d){dateOfBirth = d;}
	public String getDateOfBirth(){return dateOfBirth;}

	public void showInfo()
	{
		System.out.println("Name = "+getName());
		System.out.println("Color = "+getColor());
		System.out.println("Height = "+getHight());
		System.out.println("Weight = "+getWeight());
		System.out.println("Age = "+getAge());
		System.out.println("Date of Birth = "+getDateOfBirth());
	}

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