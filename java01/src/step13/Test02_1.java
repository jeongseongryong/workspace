/* nested class: static nested class
 * 
 */
package step13;


// package member class
public class Test02_1 {
	
	//static variable
	static int v1;
	
	//static method
	static void m1() {}
	
	// static nested class
	static class A  { 
		int a;
	}
	
	public static void main(String[] args) {
		v1 = 10;
		m1();
		A obj = new A();
	}

	public void test() {
		v1 = 20;
		
		m1();
		
		A obj = new A(); 
	}
}