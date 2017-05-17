/* 캡슐화(encapsulation) : 필드와 프로퍼티
 * 내부 클래스(inner class)라고도 부른다
 */
package step11;

	
public class Test10 { 
static enum SchoolLevel {
	HIGH_SCHOOL,BACHELOR,MASTER,DOCTOR;
}
	
	static class Student {
		
		private String name;
		private int age;
		private SchoolLevel level;
	
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
		public SchoolLevel getLevel() {
			return level;
		}
		public void setLevel(SchoolLevel level) {
			this.level = level;
		}
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setLevel(SchoolLevel.BACHELOR);
	}
}
