/*프로그램 아규먼트
 * => 프로그램을 실행할 때 넘겨주는 값
 */
package step08;

public class Test01_1 {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String str : args) {
			System.out.println(str);
		}

	}

}
