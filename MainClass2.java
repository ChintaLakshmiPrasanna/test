abstract class A
{
	abstract public void display();
	public void view()
	{
		System.out.println("view...");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("display..");
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.view();
		b1.display();
	}
}
