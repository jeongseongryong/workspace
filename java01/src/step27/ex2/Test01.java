package step27.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("step27/ex2/application-context-01.xml");
		
		System.out.println(ctx.getBean("c1"));
		System.out.println(ctx.getBean("c2"));
		System.out.println(ctx.getBean("c3"));
		System.out.println(ctx.getBean("c4"));

	}

}
