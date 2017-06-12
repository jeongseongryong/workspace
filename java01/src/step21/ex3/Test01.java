/* 추상 클래스와 
 * 1) 추상 클래스
 *  => 서브 클래스에게 공통 필드와 메서드를 상속해주는 용도로 사용한다.
 *  
 */
package step21.ex3;

public class Test01 {

	public static void main(String[] args) {
		Truck car1 = new Truck("타이탄", "비트자동차", 10000);
		
		car1.load("자갈");
		car1.run();
		car1.dump();
		
		//Car car2 = new Car(); 
		//추상클래스다 서브클래스를 찾아라! 
		//추상클래스는 인스턴스를 못만든다.
		//Loader car3 = new Loader(); //컴파일오류;
		
	}

}
