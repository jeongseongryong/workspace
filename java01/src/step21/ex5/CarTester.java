package step21.ex5;

public class CarTester {
	public static void test(Car car) { // 추상클래스 인스턴스가 넘어오는게 아니다.
		// 인스턴스를 구분할 필요없이 클래스 이름으로 바로 호출할수있는것 - static 
		// 인스턴스 변수일경우 스태틱 필요 X
		// 개별적으로 다룰 필요가없는것은 스태틱 메서드 (클래스 메서드)
		System.out.println("자동차 테스트 시작!");
		/* car 라는 이 변수의 저장된 인스턴스를 가지고 run()을 실행한다.
		 * 추상클래스 Car의 추상 메서드인 run()을 호출하는것이아니다.
		 * 파라미터의 넘어온 객체의 실제 클래스에 대해서 run()을 호출하는것
		 * 만약 car 변수에 Sedan 객체 (인스턴스 주소)가 저장되어 있다면,
		 * Sedan 클래스의 run()을 호출한다.
		 * 만약 car 변수에 Truck 객체가 저장되어 있다면,
		 * Truck 클래스의 run()을 호출한다.
		 */
		car.run();
		System.out.println("자동차 테스트 끝!");
	}
}
