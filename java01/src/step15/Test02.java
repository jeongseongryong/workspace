package step15;

public class Test02 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName("홍길동");
		s.setAge(20);
		
		//s.setSchoolLevel(4);
		
		s.setSchoolLevel(SchoolLevel.DOCTOR);
		

		System.out.println(s);
//		
//		SchoolLevel[] value = SchoolLevel.values();
//		System.out.printf("name()=%s", SchoolLevel.DOCTOR.name());
//		System.out.printf("toString()=%s", SchoolLevel.DOCTOR.toString());
//		System.out.printf("ordinal()=%s", SchoolLevel.DOCTOR.ordinal());
//		System.out.println("--------------------------");
	}

}
