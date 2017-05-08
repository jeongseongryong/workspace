/* 메서드 : 스택 메모리*/
package step05;

public class Test07 {
	public static void m1(int a){
		m2(++a);
		System.out.printf("m1()%d\n", a);
		m2(++a);
		System.out.printf("m1()%d\n", a);
	}
	public static void m2(int a){
		m3(++a);
		System.out.printf("m2()%d\n", a);
	}
	public static void m3(int a){
		++a;
		System.out.printf("m3()%d\n", a);
	}
   
   public static void main(String[] args) {
    int a = 20;
    m1(a); // a 변수를 넘기는 것이 아니라, a 변수의 값을 넘긴다.
    System.out.printf("main()%d\n", a);
		
		}
   }
  
