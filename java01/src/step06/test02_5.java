/*class 문법의 용도 : 관련된 메서드를 묶는 용도 V
 */
package step06;

public class test02_5 {
  public static void main(String[] args) {
  	// 3명학생 회원 성적 정보를 따로 보관 할수없음
  	Member.init("홍길동", 100, 100, 100);
  	Member.init("임꺽정", 90, 90, 90); //기존 멤버 클래스 변수 값을 변경함
  	Member.init("유관순", 80, 80, 80); //기존 멤버 클래스 변수 값을 변경함
  	
  	Member.compute(); //현재 유관순 성적 출력
  	Member.print(); //현재 유관순 성적 출력
  }
  
}
