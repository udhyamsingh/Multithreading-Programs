import java.util.Scanner;
class Arrays1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Values");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];

		System.out.println("Enter the values");
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index at which value is to be inserted");
		int m=sc.nextInt();
		System.out.println("Enter the value to be inserted");
		int o=sc.nextInt();
		for (int i=0;i<n+1;i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				b[i]=o;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.println("Elements are");
		for (int i=0;i<n+1;i++)
		{
			System.out.println(b[i]);
		}

	}
}