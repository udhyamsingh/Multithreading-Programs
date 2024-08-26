class MyThread extends Thread 
{
}
class THREAD
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		Thread.currentThread().setPriority(15);
		MyThread t=new MyThread();
		System.out.println(t.getPriority());

	}
}
