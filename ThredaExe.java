class MyThraed extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
		System.out.println("Child Thread");
		}
	}
}
class ThredaExe
{
	public static void main(String[] args)
	{
		MyThraed t=new MyThraed();
		t.setPriority(10);
		t.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}