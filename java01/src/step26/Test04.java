/* Class 도구 사용법: 클래스의 특정 메서드만 추출하기 */
package step26;

import java.lang.reflect.Method;

public class Test04 {
  public static void main(String[] args) throws Exception {
    
    Class<?> clazz = Myclass.class;
    
    Method m = clazz.getMethod("m1");
    System.out.println(m);
    
//    m = clazz.getMethod("m1", String.class);
//    System.out.println(m);
    
    Method m2 = clazz.getMethod("m2", int.class);
    // 인트값을 받는 메서드
    // 파라미터로 무엇을 받는가
    
    System.out.println(m2);
    
    Method m3 = clazz.getMethod("m3", String.class, int.class);
    
    System.out.println(m3);
  }
}
