import java.util.*;
class Collecion
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("Udhyam");
		l.add("Karan");
		l.add("Suraj");
		l.add("Shubham");
		l.add("Neeraj");
		l.addFirst("Me");
		l.addLast("NOTKNOWN");
		System.out.println(l);
		l.getFirst();
		l.getLast();
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}
}
