package step10.ex3;

public class Calculator {
	int result;
	
	public void plus(int value) {
		result += value;
	}																	//오버로딩! 같은이름을 가진 메서드가 추가로 적재된다
	
	public void plus(int v1, int v2) {
		result += v1 + v2;
	}
	
	public void plus(int [] values) {
		for (int v : values) {
			result += v;
		}
	}
	
	public void minus(int value) {
		result -= value;
	}
	
	
}
