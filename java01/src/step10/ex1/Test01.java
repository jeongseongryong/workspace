/* 수퍼 클래스의 메서드를 재정의 하는 방법
 * 이것을 "오버라이딩(overriding)" 이라 부른다 
 * 같은 이름을 부여, 일관성있게 도와주는 문법
 */
package step10.ex1;

public class Test01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.age = 20;
		s.print();

	}
}