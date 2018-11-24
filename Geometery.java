 import java.io.*;
abstract class Values
{
	//abstract functions
	abstract public void input() throws IOException; 
	abstract public float area();
	abstract public float perimeter();	
	}

class Rectangle extends Values
{
	int length;
	int breath;
	public void input()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter length");
				
		length=Integer.parseInt(br.readLine());
		System.out.println("Enter breath ");

		breath=Integer.parseInt(br.readLine());
	}
	public float area()
	{
		int Area=length*breath;
		return Area;
	}
	
	public float perimeter()
	{
	int Perimeter= 2*(length+breath);
	return Perimeter;
	}
}

class Triangle extends Values
{
	int length;
	int base;
	int side;
	public void input()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter all three sides of Triangle  ");	
	length=Integer.parseInt(br.readLine());
	base=Integer.parseInt(br.readLine());
	side=Integer.parseInt(br.readLine());
	}
	public float area()
	{
		float Area= 0.5f*(length*base);
		return Area;
		}
		public float perimeter()
	{
	int Perimeter= length+base+side;
	return Perimeter;
	}
}

class Circle extends Values
{
	int radius;
	
	public void input()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter radius ");
		radius=Integer.parseInt(br.readLine());
	}
	public float area()
	{
		float Area=3.14f*radius*radius;
		return Area;
	}
	public float perimeter()
	{
	float Perimeter= 3.14f*radius*2;
	return Perimeter;
	}
}




class Geometery
  {
  public static void main(String args[])throws IOException
{ 
//polymorphism
Values ref;// reference of Values class

ref=new Rectangle();
ref.input();
System.out.println("Area of rectangle " +ref.area());
System.out.println("perimeter of rectangle " +ref.perimeter());


ref=new Triangle();
ref.input();
System.out.println("Area of Triangle " +ref.area());
System.out.println("perimeter of Triangle " +ref.perimeter());


ref=new Circle();
ref.input();
System.out.println("Area of Circle " +ref.area());
System.out.println("Area of Circle " +ref.perimeter());

}
}

