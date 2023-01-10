class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			int sum = 0;
			for(int i = 1; i <= 5; i++)
			{
				sum += i;
				System.out.println("Current Sum = "+sum);
				Thread.sleep(50);
			}
		}catch(InterruptedException e){}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			int fact = 1;
			for(int i = 1; i <= 5; i++)
			{
				fact *= i;
				System.out.println("Current Factorial = "+fact);
				Thread.sleep(50);
			}
		}catch(InterruptedException e){}
	}
}
class ThreadMain
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
	}
}
