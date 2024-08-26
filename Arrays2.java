import java.util.Scanner;
class Arrays2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be displayed");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n-1];
		System.out.println("Enter the values to be displayed");
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Index to be Deleted");
		int m=sc.nextInt();
		for (int i=0;i<n-1;i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
				continue;
			else
			{
				b[i-1]=a[i];
			}
		}
		System.out.println("the valuses are");
		for (int i=0;i<n-1;i++)
		{
			System.out.println(b[i]);
		}
	}
}