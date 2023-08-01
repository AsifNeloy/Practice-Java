public class Car
{
	private String name;
	private String color;
	private String model;
	private double yearOfUse;
	private String ownerName;

	public Human(){System.out.println("Empty Constructor");}
	public Human(String name, String color, String model, double yearOfUse,String ownerName)
	{
		this.name = name;
		this.color = color;
		this.model = model;
		this.yearOfUse = yearOfUse;
		this.ownerName = ownerName;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setColor(String c){color = c;}
	public String getColor(){return color;}

	public void setModel(String m){model = m;}
	public String getModel(){return model;}

	public void setYearOfUse(double y){yearOfUse = y;}
	public double getYearOfUse(){return yearOfUse;}

	public void setOwnerName(String o){ownerName = o;}
	public String getOwnerName(){return ownerName;}

	public void showInfo()
	{
		System.out.println("Name = "+getName());
		System.out.println("Color = "+getColor());
		System.out.println("Model = "+getModel());
		System.out.println("Year Of Use = "+getYearOfUse());
		System.out.println("Owner Name = "+getOwnerName());
	}

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