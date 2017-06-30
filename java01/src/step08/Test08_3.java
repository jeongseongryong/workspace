/* 유틸리티 클래스 : properties 클래스 응용 II */
package step08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test08_3 {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    System.out.println("step08 Test08_3 실행");
    System.out.println();
    
    // 1) 프로그램 아규먼트 출력
    for (String value : args){
      System.out.println(value);
    }
    System.out.println("----------------------------------------------------------");
    
    // 2) JVM 프로퍼티 출력
    Properties props = System.getProperties();
    System.out.printf("name=%s\n", props.get("name"));
    System.out.printf("age=%s\n", props.get("age"));
    System.out.printf("tel.home=%s\n", props.get("tel.home"));
    System.out.printf("tel.office=%s\n", props.get("tel.office"));
    // .도 이름의 일부이다. 크게 신경쓰지 마라
  }

}
