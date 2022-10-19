public class Lab10q6 extends Thread
{
	public void run()
	{
		System.out.println("Serampore, Kolkata");
	}
	public static void main(String args[])
	{
		Lab10q6 l = new Lab10q6();
		l.start();
		Thread t=new Thread("Ayanika Majumdar");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}
}