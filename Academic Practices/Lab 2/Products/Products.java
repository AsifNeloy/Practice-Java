public class Products
{
	private float price;
	private int id;
	private int quantity;

	public Products(){
		System.out.println("\nProduct Information is given below\n");
	}

	public void setPrice(float p){price = p;}
	public float getPrice(){return price;}

	public void setId(int i){id = i;}
	public int getId(){return id;}

	public void setQuantity(int q){quantity = q;}
	public int getQuantity(){return quantity;}

	public void showInfo(){
		System.out.println("Price   : "+getPrice());
		System.out.println("Id      : "+getId());
		System.out.println("Quantity: "+getQuantity());
	}
}