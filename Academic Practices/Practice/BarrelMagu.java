public class BarrelMagu
{
	private String name;
	private double vodaSize;
	private int bichi1;
	private float bichi2;

	public BarrelMagu(){System.out.println("Sheeeera eker magir kache ashchen\n");}

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setVodaSize(double v){vodaSize = v;}
	public double getVodaSize(){return vodaSize;}

	public void setBichi1(int b1){bichi1 = b1;}
	public int getBichi1(){return bichi1;}

	public void setBichi2(float b2){bichi2 = b2;}
	public float getBichi2(){return bichi2;}

	public void showinfo(){
		System.out.println("\fName of the mage :"+getName());
		System.out.println("\rSize of Voda :"+getVodaSize());
		System.out.println("\'Size of Bichi 1 :"+getBichi1());
		System.out.println("\"Size of Bichi 2 :"+getBichi2());
	}
}