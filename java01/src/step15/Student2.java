package step15;

public class Student2 {
	
	private String name;
	private int age;
	private SchoolLevel schoolLevel;

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolLevel=" + schoolLevel + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SchoolLevel getSchoolLevel() {
		return schoolLevel;
	}
	public void setSchoolLevel(SchoolLevel schoolLevel) {
		this.schoolLevel = schoolLevel;
	}
}

