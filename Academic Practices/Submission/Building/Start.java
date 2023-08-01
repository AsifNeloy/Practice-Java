public class Start 
{

	public static void main(String [] args)
	{
		Building ob = new Building();
		ob.setName("Shopnonir");
		ob.setAddress("425/c Khilgoan");
		ob.setSize(20);
		ob.setOwnerName("Tofazzol Hossain");
		ob.setEngineerName("Moshin Shikder");
		ob.setPermitNo("102312-23");
		ob.setLicenseNo("20312342-1");

		ob.showInfo();

		System.out.println("\n---Initializing with constructor---\n");
		Building cpp = new Building("Bosundhara","4/a Boshundhara",25,"Mushfique Rahman","Ananta Zalil","70323123-421","232132-32");

		cpp.showInfo();
	}
}