/*다형성 - 다형적 변수
 * =>어떤 레퍼런스 변수는 그타입의 인스턴스 뿐만아니라,
 * 	  그 타입의 서브 클래스의 인스턴스까지 저장할 수 있다.
 */
package step10.ex2;

public class Test01 {

	public static void main(String[] args) {
		Member m = new Member();
		Student s1 = new Student();
		FreeStudent f1 = new FreeStudent();
		
		// 다형적 변수 (polymorphic variable) - 다형성(polymorphism)
		Member m2 = new Student();
		Member m3 = new Teacher();
		Member m4 = new FreeStudent();
		Student s2 = new FreeStudent();
	}

}
