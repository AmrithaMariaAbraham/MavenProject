package inhertance;
public class ChildC extends Parent
{
	public ChildC()
	{
		super();
		System.out.println("Child C constructor");
	}
	public static void main(String[] args) 
	{
		ChildC obj=new ChildC();
		obj.add(2, 15);
	}
}
