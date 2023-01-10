class EvenThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 2; i <= 15; i = i + 2)
			{
				System.out.println("Even Thread: "+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e){}
	}
}
class OddThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 15; i = i + 2)
			{
				System.out.println("Odd Thread: "+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e){}
	}
}
class ThreadUpto15
{
	public static void main(String args[])
	{
		EvenThread et = new EvenThread();
		et.setName("EvenThread-1");
		OddThread ot = new OddThread();
		ot.setName("OddThread-1");
		System.out.println(et.getName());
		System.out.println(ot.getName());
		et.start();
		ot.start();
	}
}