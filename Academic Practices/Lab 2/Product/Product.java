public class Product
{
	private String productName;
	private int productQty;
	private double productPrice;

	public Product(){System.out.println("\nProduct Calculation\n");}
	public Product(String productName, int productQty,double productPrice){
		this.productName=productName;
		this.productQty=productQty;
		this.productPrice=productPrice;
	}

	public void showInfo(){
		System.out.println("Name of product : "+productName);
		System.out.println("Quantity of product : "+productQty);
		System.out.println("Price of product : "+productPrice);
	}
	public double calculation(){
		return productPrice*productQty;
	}
}