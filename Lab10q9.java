class Reserve implements Runnable
{
	int available=1;
	int wanted;
	Reserve(int i)
	{
		wanted=1;
	}
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Available berths are:= "+available);
			if(available>=wanted)
			{
				String name=Thread.currentThread().getName();
				System.out.println(wanted+" Berth reserved for "+name);
				try{
					Thread.sleep(0);
					available=available-wanted;
				}
				catch(InterruptedException ie){
				}
			}
			else
				System.out.println("Sorry no berths");
		}
	}
}
class Lab10q9{
	public static void main(String args[]){
		Reserve obj=new Reserve(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("FIRST PERSON");
		t2.setName("SECOND NAME");
		t2.start();
		t1.start();
	}
}