public class Triangle
{
	private int x;
	private int y;
	private int z;

	public Triangle(){System.out.println("\nCheck Triangles\n");}
	public Triangle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void showInfo(){
		System.out.println("First side  : "+x);
		System.out.println("Second side : "+y);
		System.out.println("Third side  : "+z);
	}
	public void testTriangle()
	{
		if(x==y && y==z){System.out.println("This triangle is equilateral");}
		else if(x==y || y==z || z==x){System.out.println("This triangle is isosceles");}
		else{System.out.println("This triangle is scalene");}
	}
}