class First
{
	String name;
	int age;
	String school;
	int rollno;
	First(String name,int age,String school,int rollno)
	{
		this.name=name;
		this.age=age;
		this.school=school;
		this.rollno=rollno;
	}
		public String toString()
	{
		return name+".."+age+".."+school+".."+rollno;
	}
	public static void main(String[] args)
	{
		First f1=new First("Udhyam Singh",24,"RKMEC",101);
	}
}
