/*주제: 변수 선언 - 배열 변수와 레퍼런스 */
package step02;

public class Test08 {
  public static void main(String[] args) {
    
    byte[] arr1 = new byte[3]; 
    
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    
    System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
    
    arr1 = new byte[]{40, 50, 60, 70, 80};
    System.out.printf("%d, %d, %d, %d, %d\n", arr1[0], arr1[1], arr1[2], arr1[3], arr1[4]);
    
    // 이전에 만든 배열은 어떻게 되는가?
    // 주소를 잃어 버렸기 떄문에 프로그램이 종료될 떄 까지 사용할 수 없다.
    // 주소를 찾는 방법이 없다!
    // 이렇게 주소를 잃어버려 사용할 수 없는 메모리를
    // 프로그래밍 용어로 "Dangling Object"(Object = 메모리)라 부른다.
    // 자바에서는 "쓰레기(Garbage)"라 부른다.
    // 자바에서는 메모리를 효율적으로 관리하기 위해,
    // 이런 쓰레기를 메모리가 부족할 때 마다 정리한다.
    // 이렇게 쓰레기를 정리해 주는 프로그램을 "쓰레기 수집기(Garbage Collector)"라 부른다.
  
    // 참고! - Dangling Pointer
    // 레퍼런스에 저장된 주소가 가리키는 메모리가 정리된 채로 있을 때,
    // 더이상 그 주소는 유효하지 않다.
    // 이렇게 유효하지 않은 주소를 "Dangling Pointer"라 부른다.
    // C / C++ 언어에서는 개발자가 강제로 메모리를 해제시키는 문법이 있다.
    // 그래서 Dangling Pointer가 가능하다
    // 그러나 Java 언어에서는 개발자가 임의로 메모리를 해제 시킬수 없다.
    // 그래서 Dangling Pointer가 불가능 하다.
    // 모래사장에 모래성을 쌓고 집에가면 다음사람이 오면은 모래성을 허문다
    
    /* 쓰레기 수집기(Garbage Collector)
     * -프로그램을 실행하다보면 가비지가 발생하는데,
     *  그 가비지를 다른 용도로 사용할 수 있게 메모리를 해제시키는 프로그램을 
     *  "Garbage Collector" 라 부른다.
     * - 주의!
     *  가비지가 발생하는 즉시 가비지 컬렉터가 실행되는 것은 아니다!
     * - 언제 실행하는가?
     * 1) 메모리부족
     * JVM이 프로그램을 실행하다가 메모리가 부족하여 
     * OS에게 새로운 메모리를 달라고 요청하기 전에 실행한다.
     * 2) JVM이 한가할때 (idle time)
     * 서버 프로그램인 경우 24시간 365일 내내 실행된다.
     * 이 경우 JVM이 한가할 떄 가비지 컬렉터를 실행한다.
     * 단, 잠깐 실행하는 일반적인 경우에는 가비지 컬렉터가 실행되지 않는다.
     * 
     * - JVM이 종료되면, JVM이 사용한 모든 메모리는 무족건 OS에 자동으로 반납된다.
     */
  }

}
