 abstract class Shape{
	protected double dim1;
	protected double dim2;
	Shape(){System.out.println("Inside Shape");}
	Shape(double dim1, double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public double getDim1(){return dim1;}
	public double getDim2(){return dim2;}
	public abstract void displayArea();
}
 class Rectangle extends Shape{
	protected double length;
	protected double width;
	Rectangle(){
		super();
		System.out.println("Inside Rectangle");
	}
	Rectangle(double length, double width){
		super(length, width);
	}
	public void setLength(double length){this.length=length;}
	public double getLength(){return length;}
	public void setWidth(double width){this.width=width;}
	public double getWidth(){return width;}

	public void displayArea(){
		double area = length*width;
		System.out.println("Area of Rectangle is = "+area);
	}
}
 class Triangle extends Shape{
	protected double base;
	protected double hight;
	Triangle(){
		super();
		System.out.println("Inside Triangle");
	}
	Triangle(double base, double hight){
		super(base, hight);
	}
	public void setBase(double base){this.base=base;}
	public double getBase(){return base;}
	public void setHight(double hight){this.hight=hight;}
	public double getHight(){return hight;}

	public void displayArea(){
		double area = 0.5*(base*hight);
		System.out.println("Area of Triangle is = "+area);
	}
}
 class Circle extends Shape{
	protected double radius;
	Circle(){
		super();
		System.out.println("Inside Circle");
	}
	Circle(double radius){
		super(radius, 0.0);
	}
	public void setRadius(double radius){this.radius=radius;}
	public double getRadius(){return radius;}

	public void displayArea(){
		double area = 3.1416*(radius*radius);
		System.out.println("Area of Circle is = "+area);
	}
}
public class Main{
	public static void main(String[]args){
		Rectangle r = new Rectangle(4.5,2.5);
		Triangle t = new Triangle(3.5,2.5);
		Circle c = new Circle(3.5);

		r.displayArea();
		t.displayArea();
		c.displayArea();
	}
}