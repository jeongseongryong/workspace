package step09.ex4;

public class C extends B {
	int c;
	
	public C() { 
		// super(); // C의 수퍼클래스인 B에는 기본생성자가 없음 그래서 컴파일오류
		
		// 수퍼클래스에 있는 생성자를 호출
		super(7); 
		System.out.println("C()");
	}
}
