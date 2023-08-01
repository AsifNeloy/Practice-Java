public class Main 
{
	public static void main(String []args)
	{
		BarrelMagu chugi = new BarrelMagu();
		chugi.setName("Arnob 1no mage");
		chugi.setVodaSize(4.33434);
		chugi.setBichi1(4);
		chugi.setBichi2(3.5F);
		chugi.showinfo();
		float x = chugi.getBichi1() + chugi.getBichi2();
		System.out.println("\tBichis Together = "+x);
	}
}