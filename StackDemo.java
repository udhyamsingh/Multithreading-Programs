import java.util.*;
class StackDemo
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("A");
		s.push("D");
		s.push("B");
		s.push("E");
		s.push("C");
		s.push("Z");
		System.out.println(s);
		System.out.println(s.search("B"));
		System.out.println(s.search("b"));
	}
}