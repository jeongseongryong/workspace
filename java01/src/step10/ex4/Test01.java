/* super 키워드의 사용 
 * super 자신을 뺸 조상 클래스로 따라 올라가면서 첫번쨰로 만난 메서드를 호출
 * 재정의 하지않았으면 super는 무시
 */

	package step10.ex4;
	
public class Test01 {

	public static void main(String[] args) {
		C obj = new C();
		obj.test1();
		System.out.println("-------------");

		
		obj.test2();
		System.out.println("-------------");
	}

}