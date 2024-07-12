package inhertance;
public class ChildA extends Parent 
{
	public static void display1()
	{
		System.out.println("Child A instance method");
	}
	public static void main(String[] args)
	{
		ChildA obj=new ChildA();
		obj.add(5, 10);
		Parent.display();
	}
}
