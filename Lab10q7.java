class MyThread extends Thread
{
	String name;
	MyThread(String tname)
	{
		name=tname;
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(name+" : "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name+" interrupted.");
		}
		System.out.println(name+" exiting ");
	}
}
class Lab10q7
{
	public static void main(String args[])
	{
		MyThread t1=new MyThread("THREAD");
		try
		{
			Thread.sleep(500);
			t1.suspend();
			System.out.println("THREAD SUSPENDED");
			Thread.sleep(500);
			t1.resume();
			System.out.println("THREAD RESUMED");
			Thread.sleep(500);
			t1.stop();
			System.out.println("THREAD STOPPED");
		}
		catch(InterruptedException e)
		{
			System.out.println("MAIN THREAD INTERRUPTED.");
		}
		System.out.println("MAIN THREAD EXITING");
	}
}