/*다형성 - 다형적 변수 II
 * =>어떤 레퍼런스 변수는 그타입의 인스턴스 뿐만아니라,
 * 	  그 타입의 서브 클래스의 인스턴스까지 저장할 수 있다.
 */
package step10.ex2;

public class Test02 {

	public static void main(String[] args) {
		// Member m = new Member(); // OK
		// Member m = new Student(); // OK member의  변수 + Student의 변수 
	  Member m = new FreeStudent(); // OK member의  변수 + Student의 변수 + FreeStudent의 변수
		
		m.name = "홍길동";
		m.id = "hong";
		m.password = "1111";
		m.tel = "1111-1111";
		m.email = "hong@test.com";
		
		//Student s = new Student(); // OK
		Student s = new FreeStudent(); // OK
		//Student s = new Member(); // Error .Member의  변수
		s.name = "홍길동";
		s.id = "hong";
		s.password = "1111";
		s.tel = "1111-1111";
		s.email = "hong@test.com";
		s.schoolName = "비트대학교";
		s.grade = 4;
		
	}

}