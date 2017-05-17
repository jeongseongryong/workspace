/*다형성 - 다형적 변수 II
 * =>어떤 레퍼런스 변수는 그타입의 인스턴스 뿐만아니라,
 * 	  그 타입의 서브 클래스의 인스턴스까지 저장할 수 있다.
 */
package step10.ex2;

public class Test03 {

	public static void main(String[] args) {
		Member[] arr = new Member[10];
		arr[0] = new Member();
		arr[1] = new Student();
		arr[2] = new Manager();
		arr[3] = new Teacher();
		arr[4] = new FreeStudent();
	}

}