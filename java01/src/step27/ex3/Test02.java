package step27.ex3;

public class Test02 {

	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("tico");
		Car c2 = CarFactory.createCar("tico");
		Car c3 = CarFactory.createCar("sonata");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		}
		
	}

