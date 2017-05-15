package step11;

public class Calculator2 {
	private int result; // 외부에서 직접 접근하지 못하게 제한 한다.
	
	public void plus(int value) {
		result += value;
	}
	
	public void minus(int value) {
		result -= value;
	}
		
	public int getResult() {
		return result;
	}
	
}

