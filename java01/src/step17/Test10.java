/* 예외처리 : Throws 선언 III
 * => java.lang.RuntomeException 계열의 예외를 던질 때는
 * 		예외를 처리하는 것이 선택사항이다.
 */
package step17;

public class Test10 {	
	
	public static void main(String[] args) 
		throws Exception/* IllegalArgumentException ,NumberFormatException*/{
		
		if(args.length < 1)
			throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
		
		int age = Integer.parseInt(args[0]);
	
		if (age < 1)
			throw new Exception("나이가 유효하지 않습니다");
		
		System.out.println(age);
			
	}
		
}


