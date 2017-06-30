/*주제: 변수 선언 - 배열 변수  */
package step02;

public class Test06 {
  public static void main(String[] args) {
    // 1) 배열 레퍼런스 배열 선언하기
    byte[] arr1; // 자바 언어에서 주로 사용하는 스타일
//  byte arr1[]; // c언에서 주로 사용하는 문법도 지원한다.
    /* 설명
     * => byte[] arr1
     * - byte 배열의 주소를 저장할 변수를 선언한다.
     * - '레퍼런스 변수' 또는 줄여서 '레퍼런스'라고 부른다.
     * - 일반적인 값을 저장할수 없다.
     */
    // arr1 = 10; // 일반적인 값 저장 할 수 없다. 컴파일 오류!
    // arr1[0] = 10; // arr1 변수의 값을 초기화 시키지도 않고 사용하면, 컴파일 오류!
    
    // 주의! 
    //자바에서 모든 종류의 변수에 대해 값을 초기화 시키지 않고 사용하려 하면, 컴파일 오류!
    
    arr1 = null; // null은 일단 변수에 사용할 수 없다. 오직 레퍼런스 변수에만 사용할 수 있다.
    // arr1에 명확하게 값을 초기화 시켰지만, 그 값은 주소 없음을 의미한다.
    // arr1[0] = 10; // null로 초기화 시켰다 하더라도 일단 변수의 값은 초기화 된 것이기 때문에 
                  // 컴파일 오류는 발생하지 않는다. 
                  // 다만 실행할때 해당 메모리가 없기 때문에 실행 오류가 발생한다!
                  // 실행 오류를(Runtime Exception)이라 부른다.
                  // 이렇게 주소를 주지 않고 레퍼런스 변수를 사용하려 하면,
                  // NullPointerException 오류가 발생한다.
    
    // 2) 배열을 생성하여 그 주소를 레퍼런스에 담기
    arr1 = new byte[3];
    
    /* => new byte[3]
    *  - byte 타입의 메모리를 연속하여 3개 준비한다.
    *  - 그리고 시작 메모리의 주소를 리턴한다.
    */
    
    // 3) 배열에 값 담기
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    
    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
  }

}
