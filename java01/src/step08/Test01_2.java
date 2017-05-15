/*프로그램 아규먼트 연습
 * 두 개의 깂과 한 개의 연산자를 입력 받아 계산 결과를 출력하라!
 * 
 *  java -cp bin step08.Test01_2 10 * 3
 *  10 * 3 =30
 *  
 *  문자열을 숫자로 바꾸는 방법
 *  int a = Integer.parseInt("111");
 */
package step08;

public class Test01_2 {

	public static void main(String[] args){
		
   if (args.length < 3) {
  	 System.out.println("[사용법]");
  	 System.out.println(">java -cp bin step08.Test01_2 10 * 200");
  	 System.out.println("연산자" );
  	 return;
   }

		int a = Integer.parseInt(args[0]);
		String op = args[1];
		int b = Integer.parseInt(args[2]);
		int result;
	
		switch (op) {
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		default:
			System.out.printf("%s 연산자는 지원하지 않습니다!", op);
			return;
		}
	}
	public static void printResult(int a, int b, String op, int result) {
		System.out.printf("%d %s %d = %d\n", a, op, b, result); 
	}
}

