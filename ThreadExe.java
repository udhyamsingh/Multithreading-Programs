class MyThread extends Thread
{
	public void run()
	{
		System.out.println("NO arg method");
	}
	public void run(int i)
	{
		System.out.println("Int arg method");
	}
}
class ThreadExe
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		//t.start();
		t.run(10);
	}
}