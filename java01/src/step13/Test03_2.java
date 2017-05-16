/* nested class: non-static nested class 
 * "inner class" 바깥 클래스의 변수 사용하기
 * 인스턴스 멤버이기 때문에 다른 인스턴스 멤버만이 사용 가능
 * 
 */
package step13;

import step13.Test03_3.A;

public class Test03_2 {
	int v1;
	int v2;
	
	class A {
		int v1;
		public void m1() {
			this.v1 = 100;
			System.out.printf("A.v1= %d\n", this.v1);
			
			System.out.printf("Test03_2.v2 = %d\n", v2);
			
			//System.out.printf("Test03_2.v2 = %d\n",this.v2);
			System.out.printf("A.v1 = %d\n", v1);
			
			System.out.printf("Test03_2.v1 = %d\n",Test03_2.this.v1);
		}
	}
	
	public void test() {
		A p = new A();
		p.m1();
		System.out.printf("v1=%d, v2=%d\n", this.v1, this.v2);
	}
	
	public static void main(String[] args) {
		Test03_2 obj = new Test03_2();
		obj.v1 = 10;
		obj.v2 = 20;
		obj.test();
		
	}
}
