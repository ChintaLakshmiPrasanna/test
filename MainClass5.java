abstract class K
{
	abstract public void watch();
}
class L extends K
{
	public void watch()
	{
		System.out.println("watch movie");
	}
}
class MainClass5 
{
	public static void main(String[] args) 
	{
		K k1=(K)new L();
		k1.watch();
	}
}
