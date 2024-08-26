class Sleep
{
	public static void main(String[] args) throws InterruptedException
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println("Sleep Method Is Working");
			Thread.sleep(5000);
		}
	}
}