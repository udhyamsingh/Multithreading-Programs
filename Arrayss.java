import java.util.Scanner;
class Arrayss
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];

		System.out.println("Enter the values");
		for (int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("Enter the index at which value will bw inserted");
		int m=sc.nextInt();
		System.out.println("ENter value to be inserted");
		int o=sc.nextInt();
		for(int i=0;i<n+1;i++)
	{  
		if (i<m)
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
	System.out.println("Elemnets are:");
		for (int i=0;i<n+1;i++)
		{
			System.out.println(b[i]);
		}
	}
}