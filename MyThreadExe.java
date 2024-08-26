class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Child Thread");
	}
}
class MyThreadExe
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		//t.start();
		t.run();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thraed");
		}
	}
}