class MyThread extends Thread
{
	public void run()
	{
		for (int i=1;i <=10;i++)
		{
			System.out.println("Chil Thraed");
			Thread.yield();
		}
	}
}
class ThreadMy
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("Main Thraed");
		}
	}
}