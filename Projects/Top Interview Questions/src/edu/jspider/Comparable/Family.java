package edu.jspider.Comparable;

public class Family implements Comparable{

	String name;
	int age;
	String gender;
	public Family(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Family [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Family f=(Family)o;
		return name.compareToIgnoreCase(f.name);
		//return age-f.age;
	}
}
