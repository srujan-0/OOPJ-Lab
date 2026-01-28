class Student 
{
	int rollno;
	String name;
	String branch;
	int marks;
	void getData(int rollno, String name, String brance, int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
		void display()
		{
			System.out.println("Roll Number:"+rollno);
			System.out.println("Name:"+name);
			System.out.println("Branch:"+branch);
			System.out.println("Marks:"+marks);
		}
	public static void main(String []args)
	{
		Student s1=new Student();
		Student S2=new Student();
		s1.getdata(1,"Srujan","cse",99);
		s2.getdata(2,"Reddy","IT",98);
		s1.display();
		s2.display();
	}
}
