class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread");
		}
	}
}
class MyRunnableExe
{
	public static void main(String[] args)
	{
		MyRunnable mv=new MyRunnable();
		Thread t=new Thread(mv);
		t.start();
		for (int i=1;i<=10;i++ )
		{
			System.out.println("Parent Thraed");
		}

	}
}