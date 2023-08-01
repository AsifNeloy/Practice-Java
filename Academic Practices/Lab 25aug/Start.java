class Shape{
	public double area(){return 0;};
}
class Rectangle extends Shape{
	protected double length;
	protected double width;
	Rectangle(){System.out.println("Inside Rectangle");}
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public double area(){return (length*width);}
}
class Circle extends Shape{
	protected double radius;
	Circle(){System.out.println("Inside Circle");}
	Circle(double radius){this.radius=radius;}
	public double area(){return 3.1416*(radius*radius);}
}
class Triangle extends Shape{
	protected double base;
	protected double hight;
	Triangle(){System.out.println("Inside Trinagle");}
	Triangle(double base, double hight){
		this.base=base;
		this.hight=hight;
	}
	public double area(){return 0.5*(base*hight);}
}
public class Start{
	public static void main(String[]args){
		Shape array[] = new Shape[3];
		
		array[0]= new Rectangle(4.5,2.5);
		array[1]= new Circle(2.5);
		array[2]= new Triangle(3.5,2.5);
		
		System.out.println("Area of Rectangle is = "+array[0].area());
		System.out.println("Area of Circle is = "+array[1].area());
		System.out.println("Area of Triangle is = "+array[2].area());
	}
}