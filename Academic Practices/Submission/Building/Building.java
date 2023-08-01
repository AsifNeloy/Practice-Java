public class Building
{
	private String name;
	private String address;
	private double size;
	private String ownerName;
	private String engineerName;
	private String permitNo;
	private String licenseNo;

	public Building(){System.out.println("Empty Constructor\n");}
	public Building(String name, String address, double size, String ownerName, String engineerName, String permitNo, String licenseNo)
	{
		this.name = name;
		this.address = address;
		this.size = size;
		this.ownerName = ownerName;
		this.engineerName = engineerName;
		this.permitNo = permitNo;
		this.licenseNo = licenseNo;
	}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setAddress(String a){address = a;}
	public String getAddress(){return address;}

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
		System.out.println("Address = "+getAddress());
		System.out.println("Size = "+getSize());
		System.out.println("Owner Name = "+getOwnerName());
		System.out.println("Engineer Name = "+getEngineerName());
		System.out.println("Permit No = "+getPermitNo());
		System.out.println("License No = "+getLicenseNo());
	}
}