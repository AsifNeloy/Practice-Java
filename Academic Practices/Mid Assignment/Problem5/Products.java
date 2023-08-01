public class Products
{
	private int productNo;
	private String productName;
	private double price;
	private int qty;
	private double tax=0.07;
	private double discount=0.15;
	public Products(){System.out.println("---Products---");
			System.out.println("1. Chicken");
			System.out.println("2. Beef");}

	public void setProductNo(int no){productNo=no;}
	public int getProductNo(){return productNo;}

	public void setProductName(){
		if(productNo==1){productName="Chicken";}
		if(productNo==2){productName="Beef";}
	}
	public String getProductName(){return productName;}

	public void setQty(int q){qty=q;}
	public int getQty(){return qty;}

	public void setPrice(){
		if(productNo==1){price=280.0;}
		if(productNo==2){price=450.0;}
	}

	public double calculation(){
		price = price*(double)qty;
		price = price - (price*discount);
		price = price + (price*tax);
		return price;
	}

	public void showInfo(){
		System.out.println("\nProduct number : "+getProductNo());
		System.out.println("Product name : "+getProductName());
		System.out.println("Product quantity : "+getQty());
	}
}