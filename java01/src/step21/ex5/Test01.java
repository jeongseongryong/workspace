/* 인터 페이스  사용 전
 * 특정한 클래스의 서브 클래스가 아니면 사용할 수 없는 문제!
 * 이것이 상속의 한계!
 */
package step21.ex5;

public class Test01 {

	public static void main(String[] args) {
		Truck car1 = new Truck("타이탄", "비트자동차", 10000);
		Sedan car2 = new Sedan("티코", "비트자동차", 980, true);
		Bulldozer car3 = new Bulldozer("제우스", "비트자동차", 20000);
		Tesla car4 = new Tesla();
		
		car1.run();
		car2.run();
		car3.run();
		car4.run();
		
		System.out.println("Truck 테스트----------------");		
		CarTester.test(car1);
		
		System.out.println("Sedan 테스트----------------");		
		CarTester.test(car2);
		
		System.out.println("Bulldozer 테스트----------------");		
		CarTester.test(car3);
		
		System.out.println("Tesla 테스트----------------");
//		CarTester.test(car4); //컴파일 오류
	}

}
