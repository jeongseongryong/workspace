/*변수 선언 :2차원 배열의 초기화  */
		package step02;

public class Test12 {
	public static void main(String[] args) {
		//1) 새 데이터 타입을 정의한다.
      class Student {
      	String name;
      	byte[] scores;
      	short total;
      	float aver;
      }
      
      //2) 새데이터 타입에 따라 만든 메모리의 주소를 담을 변수 선언
      Student s1;
      //3) 새 데이터 타입에 따라 메모리를 준비한다.
      //=> 리턴 값은 새로 분지한 메모리의 주소이다.
      s1 = new Student(); //준비된 메모리 주소
      
      //4) 그 메모리에 값 넣기
      s1.name = "홍길동";
      s1.scores = new byte[3];
      s1.scores[0] = 100;
      s1.scores[1] = 100;
      s1.scores[2] = 100;
      s1.total = (short)(s1.scores[0] + s1.scores[1] + s1.scores[2]);
      s1.aver =s1.total / 3f;
      
      
      System.out.printf("이름:%s,국어:%d,수학:%d,영어:%d,합계:%d,평균:%.1f\n",
      		s1.name, s1.scores[0], s1.scores[1], s1.scores[2], s1.total, s1.aver);

      
      Student s2 =s1;
      s2.name = "임꺽정";
      System.out.printf("이름:%s,국어:%d,수학:%d,영어:%d,합계:%d,평균:%.1f\n",
      		s1.name, s1.scores[0], s1.scores[1], s1.scores[2], s1.total, s1.aver);
      
      //자바는 자바 스크립트와 다르게, 설계도에 따라 만든 메모리 외에는
      //임의로 다른 메모리를 추가할 수 없다.
      //s1.tel = "1111-1111"; //컴파일오류
   }
}
/*
 * primitive data type
 * => byte, short, int, long, float, double, boolean, char
 * 
 *  사용자 정의 데이터 타입
 *  =>문법
 *  class 데이터 타입명
 *  테이터 타입 변수명;
 *  
 *  }
 *  
 *  인스턴스?
 *  => class 설계도에 따라 준비한 메모리
 *  => 보통 "객체" 라고도 부른다.
 *  
 *  
 *  레퍼런스?
 *  => 배열이든 인스턴스든 메모리의 주소를 저장하는 변수를 말한다.
 *  
 *  class 문법?
 *  1)사용자 정의 데이터 타입을 만들 떄
 *  2)메서드를 기능이나 역할에 따라 분류 할 때
 *  
 *  필드(field)?
 *  => 인스턴스를 구성 하는 메모리 항목을 말한다.
 *  =>field = attribute != property
 *  
 *  프로퍼티?
 *  =>인스턴스의 필드를 다루는 getXxx()/setXxx() 메서드를 가리키는 용어
 */