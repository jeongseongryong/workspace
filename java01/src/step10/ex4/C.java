package step10.ex4;

public class C extends B {
	int c;
	
	public void m2() {
		System.out.println("C.m2()"); //B m2 재정의
	}
	
	public void m3() {
		System.out.println("C.m3()"); //A m3 재정의
	}
	
	
	public void m5() {
		System.out.println("C.m5()"); //새로추가 
	}
	public void test1() {
		m1();
		m2();
		m3();
	}
	
	public void test2() {
	super.m1();
	super.m2();
	super.m3();
	m4();
	super.m4();
	m5();
	//super.m5; // 재정의하거나 상속 받은 메서드가 아니기 때문에 컴파일오류
	}
}