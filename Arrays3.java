import java.util.Scanner;
class Arrays3
{
    public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values to be inserted");
	
	System.out.println("Enter number of rows");
	int m=sc.nextInt();
	System.out.println("Enter number of columns");
	int n=sc.nextInt();
	int[][] a=new int[m][n];


	for (int i=0;i<m;i++)
	{
		for (int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Entered Numbers Are");
        for (int i=0;i<m;i++)
        {
			for (int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
        }
	}
}