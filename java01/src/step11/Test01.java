package step11;

public class Test01 {

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		c.plus(10);
		c.plus(7);
		c.minus(3);
		
		c.result = 100;
		
		System.out.println(c.result);
		
	}

}
