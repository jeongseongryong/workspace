package step21.ex4;
// 수퍼클래스에서 상속받은  Car의 run() 오버라이딩

public abstract class Car {

	protected String model;
	protected String maker;
	protected int cc;

	public Car() {
		super();
	}
	
	public Car(String model, String maker, int cc) {
		this.model = model;
		this.maker = maker;
		this.cc = cc;
		
	}
	//이 메서드는 어차피 서브 클래스에서 무조건 재정의할 것이다.
	public abstract void run();

}