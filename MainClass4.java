abstract class AliNotes
{
	abstract public void topic21();
	abstract public void topic30();
}
abstract class JamesNotes extends AliNotes
{
	public void topic21()
	{
		System.out.println("topic21 completed");
	}
}
class RamNotes extends JamesNotes
{
	public void topic30()
	{
		System.out.println("topic30 completed");
	}
}
class MainClass4 
{
	public static void main(String[] args) 
	{
		RamNotes rn=new RamNotes();
        rn.topic21();
		rn.topic30();
	}
}