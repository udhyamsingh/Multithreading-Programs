class MyThread extends Thread
{
	public void run()
	{
		for (int i=1;i<=10000 ;i++ )
		{
			System.out.println("I am Lazy Thread"+i);
		}
		System.out.println("I Am Enterring Into Sleeping State");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			System.out.println("I Got Interrupted");
		}
	}
}
class SleepsExe
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End Of main Thraed");
	}
}