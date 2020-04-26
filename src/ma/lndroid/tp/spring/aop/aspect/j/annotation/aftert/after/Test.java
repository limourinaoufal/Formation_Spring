package ma.lndroid.tp.spring.aop.aspect.j.annotation.aftert.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final String PATH="ma/lndroid/tp/spring/aop/aspect/j/annotation/aftert/after/applicationContext.xml";
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		Operation e = (Operation) context.getBean("opBean");
		System.out.println("calling Operation msg...");
			e.msg();
		System.out.println("calling Operation m...");
			e.m();
		System.out.println("calling Operation k...");
			e.k();
	}
}
