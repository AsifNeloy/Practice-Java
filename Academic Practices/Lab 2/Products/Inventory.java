public class Inventory
{
	public static void main(String [] args)
	{
		Products ob = new Products();
		ob.setPrice(50F);
		ob.setId(2);
		ob.setQuantity(8);
		ob.showInfo();

		Products vy = new Products();
		vy.setPrice(80F);
		vy.setId(4);
		vy.setQuantity(5);
		vy.showInfo();
	}
}