package step15;

public class Test01 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName("홍길동");
		s.setAge(20);
		
		s.setSchoolLevel(SchoolLevel.DOCTOR);
		
		//s.setSchoolLevel(5); 컴파일오류

		System.out.println(s);
	}

}