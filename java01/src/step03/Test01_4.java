/* 연산자 : 산술 연산자(+,-,/,*,%): 명시적 형변환 II
 * 
 */
package step03;

public class Test01_4 {

  public static void main(String[] args) {
    int i = '가'; //작은 따옴표는 '가' 문자의 유니코드 값을 리턴함 = 44032
    System.out.println(i);
    System.out.println((char)i);
  }
}