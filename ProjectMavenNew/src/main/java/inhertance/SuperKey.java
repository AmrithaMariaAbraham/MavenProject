package inhertance;
public class SuperKey 
{
int a,b,mul=0;
	public SuperKey()
	{
		System.out.println("SuperKey Constructor");
	}
	public int product(int a,int b)
	{
		this.a=a;
		this.b=b;
		mul=a*b;
		System.out.println("Product:"+mul);
		return mul;
	}
}
