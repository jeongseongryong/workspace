package step10.ex4;

public class B extends A {
	int b;

	public void m1() { //A m1() 재정의
		System.out.println("B.m1()");
	}
	

	public void m2() {	//A m2() 재정의
		System.out.println("B.m2()");
	}
	
	public void m4() { // 새로추가
		System.out.println("B.m4()");
	}
	
}