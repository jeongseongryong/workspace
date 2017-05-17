/* nested class: local class
 * "inner class" 라고도 한다.
 * 인스턴스 멤버이기 때문에 다른 인스턴스 멤버만이 사용 가능
 * 
 */
package step13;

public class Test04_1 {
	public static void main(String[] args) {
		// local class
		class A {
			int a;
		}
		
		A obj = new A();
		obj.a = 200;
	}
	
	public static void test() {
		A obj = new A();
	}
}