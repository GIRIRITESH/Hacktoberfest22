public class Lab10q8 implements Runnable
{
	public void run()
	{
		for (int x=1; x<=3; x++)
			System.out.println(x +" This is thread "+ Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Lab10q8(), "Thread A");
		Thread t2 = new Thread(new Lab10q8(), "Thread B");
		Thread t3 = new Thread(new Lab10q8(), "Thread C");
		t3.setPriority(10);
		t2.setPriority(5);
		t1.setPriority(1);
		t3.start();
		t1.start();
		t2.start();
	}
}
	