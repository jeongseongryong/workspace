/*객체지향 프로그래밍(Object-Oriented Programming; OOP)
 *  코드를 역할에 따라 분류하여 프로그래밍 하는 방법
 *  역할에 따라 묶은 코드를 인간이나 사물처럼 하나의 독립된 개체로 간주함
 *  코드를 인간 사회 흐름과 같이 표현하기 때문에 이해하고 관리하기 쉬움
 *  class 라는 문법으로 표현한다.
 */
package step06;

public class test01_1 {
	//1) 사용자 정의 데이터 타입 만들기
  static class Student {
  	String name;
  	int[] scores = new int[3];
  	int total;
  	float aver;
  }
  public static void main(String[] args) {
  	//2) 사용자 정의 데이터 타입으로 메모리 준비하기
  	Student s;
  	s = new Student();
  	
  	s.name = "홍길동";
  	s.scores[0] = 100;
  	s.scores[1] = 90;
  	s.scores[2] = 80;
  	s.total = s.scores[0] + s.scores[1] + s.scores[2];
  	s.aver = s.total / 3f;
  	
  	System.out.printf("%s, %d, %d, %d, %d, %f\n",
  		s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
  }

}
