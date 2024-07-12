package inhertance;
public class Parent
{
	int a,b,sum=0;
	public Parent()
	{
		System.out.println("Parent Constructor");
	}
	public int add(int a,int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		System.out.println("SUM is:"+sum);
		return sum;
	}
	public static void display()
	{
		System.out.println("Static method display");
	}
}
