import java.util.*;
class Vectors
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		System.out.println(v.capacity());
		for (int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.add("Udhyam");
		System.out.println(v.capacity());
		System.out.println(v);
	}
}