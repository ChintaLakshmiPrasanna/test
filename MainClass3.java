abstract class P
{
	abstract public void show();
} 
class Q extends P
{
	public void show()
	{
		System.out.println("show..");
	}
}
class R extends P
{
	public void show()
	{
		System.out.println("movie show..");
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.show();
		R r1=new R();
		r1.show();
	}
}
