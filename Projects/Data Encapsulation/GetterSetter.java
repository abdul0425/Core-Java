class Student
{
	private int studentId;
	private String studentName;

	// Getting and Setting the value of ID :
	public int getId()
	{
		return this.studentId;
	}
	public void setId(int id)
	{
		this.studentId = id;
	}

	// Getting and Setting the value for Name :
	public String getName()
	{
		return this.studentName;
	}
	public void setName(String name)
	{
		this.studentName = name;
	}

}
class Test
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setId(101);
		s1.setName("Arshad");
		s2.setId(102);
		s2.setName("Alam");
		System.out.println("Student Name :"+ s1.getName() +" "+"and the Id :"+s1.getId());
	}
}