package inhertance;
public class SuperKeyChild extends SuperKey
{
	public SuperKeyChild()
	{
		super();
		System.out.println("Super Key Child constructor");
		super.product(5, 15);
	}
	public static void main(String[] args)
	{
	SuperKeyChild obj=new SuperKeyChild();
	obj.product(3, 5);
	}

}
