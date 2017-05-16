/* nested class: non-static nested class 
 * "inner class" 바깥 클래스의 변수 사용하기
 * 인스턴스 멤버이기 때문에 다른 인스턴스 멤버만이 사용 가능
 * 
 */
package step13;
public class Test03_3 {
	int v1 = 100;
	int v2 = 300;

	
	class A {
		int v1 =200;
		
		public void m1() {
			System.out.printf("A.v1=%d\n",v1);// A.v1
			System.out.printf("A.v1=%d\n",this.v1);
			System.out.printf("A.v1=%d\n",A.this.v1);
			System.out.printf("A.v1=%d\n",Test03_3.this.v1);
			
			System.out.printf("Test03_3.v2=%d\n", v2);
		}
	}

	
	public static void main(String[] args) {
		Test03_3 obj = new Test03_3();
		A obj2 = obj.new A(); 
		obj2.m1();
		
	}
}
