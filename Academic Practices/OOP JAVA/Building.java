public class Building
{
	private String name;
	private String address;
	private double size;
	private String ownerName;
	private String engineerName;
	private String permitNo;
	private String licenseNo;

	public Building(){System.out.println("Empty Constructor");}
	public Building(String name, String address, double size, String ownerName, String engineerName, String permitNo, String permitNo)
	{
		this.name = name;
		this.color = color;
		this.size = size;
		this.ownerName = ownerName;
		this.engineerName = engineerName;
		this.permitNo = permitNo;
		this.licenseNo = licenseNo;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setColor(String c){color = c;}
	public String getColor(){return color;}Size

	public void setSize(double s){size = s;}
	public double getSize(){return size;}

	public void setOwnerName(String o){ownerName = o;}
	public String getOwnerName(){return ownerName;}

	public void setEngineerName(String e){engineerName = e;}
	public String getEngineerName(){return engineerName;}

	public void setPermitNo(String p){permitNo = p;}
	public String getPermitNo(){return permitNo;}

	public void setLicenseNo(String l){licenseNo = l;}
	public String getLicenseNo(){return licenseNo;}

	public void showInfo()
	{
		System.out.println("Name = "+getName());
		System.out.println("Color = "+getColor());
		System.out.println("Size = "+getSize());
		System.out.println("Owner Name = "+getOwnerName());
		System.out.println("Engineer Name = "+getEngineerName());
		System.out.println("Permit No = "+getPermitNo());
		System.out.println("License No = "+getLicenseNo());
	}

	public static void main(String [] args)
	{
		Building ob = new Building();
		ob.setName("Shopnonir");
		ob.setColor("Brown");
		ob.setSize(20);
		ob.setOwnerName("Tofazzol Hossain");
		ob.setEngineerName("Moshin Shikder");
		ob.setPermitNo("102312-23");
		ob.setLicenseNo("20312342-1");

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Building cpp = new Building("Bosundhora","White",25,"Mushfique Rahman","Ananta Zalil","70323123-421","232132-32");

		cpp.showInfo();
	}
}