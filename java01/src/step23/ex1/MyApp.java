/* ver.1 - 데스크톱 자바 프로그램 과 구동 원리 
 * 
 * - 데스크톱 자바 프로그램의 한계
 *  1) 사용자 컴퓨터에 .class 파일을 실행할 수 있는 JRE를 설치해야한다.
 *  2) 사용자에게 .class 파일을 배포해야 한다.
 *  3) 자바 프로그램에서 사용하는 외부 라이브러리 파일 .jar를 배포해야한다.
 *  4) 사용자가 명령창에서 실행해야 한다.
 *  
 *  해결 방법 ?
 *  웹 브라우저와 웹서버를 이용한 애플리케이션 실행
 *  1) 사용자는 JRE를 설치할 필요가 없다.
 *  2) 개발자가 만든 자바 프로그램을 다운로드 할 필요가 없다.
 *  3) 장소의 제약없이 OS에 상관없이 웹 브라우저만 있으면,
 *      언제나 프로그램을 실행할 수 있따.
 *      
 * - 패키지에 첨부된 그림 참조!
 * */

package step23.ex1;

public class MyApp {

  public static void main(String[] args) {
    System.out.println("step23 ex1");System.out.println();
    
    System.out.println("Hello World");
  }

}
