package step10.ex1;

public class BitStudent extends Student {
	String school;

	void print() {
		/*
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		*/
		super.print(); // 재정의 하기전에 print() 메서드를 호출
		System.out.printf("학교:%s\n", school);
	}
	
}
