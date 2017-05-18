/* 예외처리 : 사용자 정의 예외 던지기
 */
package step17;

public class Test07 {	
	static class InvalidValueScopeException extends IllegalArgumentException {

		// 사용자 정의 예외 클래스를 만드는 이유: 기능을 확장하기위함이 아니라 예외상황이 발생시 클래스 이름으로 즉시 그예외 상황을 파악하기 위해
		// 예외 클래스의 상속관계는 이름으로 예외를 분류한것. 
		public InvalidValueScopeException() { 
			super();
			// TODO Auto-generated constructor stub
		}

		public InvalidValueScopeException(String message, Throwable cause) { // 문자열 다른 예외정보
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public InvalidValueScopeException(String s) { //문자열
			super(s);
			// TODO Auto-generated constructor stub
		}

		public InvalidValueScopeException(Throwable cause) { // 다른예외정보
			super(cause);
			// TODO Auto-generated constructor stub
		}
		
	}
	public static void main(String[] args) {
		try {
			if(args.length < 1)
				throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
			
			int age = Integer.parseInt(args[0]);
		
			if (age < 1)
				throw new InvalidValueScopeException("나이가 유효하지 않습니다");
			
			System.out.println(age);
			
		}catch (Throwable ex) { // 호출시 자세한내용 출력
			ex.printStackTrace();
			
		
		}
		
	}

}
