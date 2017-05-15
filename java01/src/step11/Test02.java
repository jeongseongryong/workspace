/* 캡슐화 (encapsulation): private 옵션
 * => 변수 선언이나 메서드 선언 앞에 붙여서
 * 		그 변수나 메서드의 기본성질을 변경한다고 해서
 *  	이런 키워드를 "변경자(modifier)"라고 부른다.
 */
package step11;

public class Test02 {

	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		c.plus(10);
		c.plus(7);
		c.minus(3);
		
		//c.result = 100;
		
		System.out.println(c.getResult());
		
	}

}
