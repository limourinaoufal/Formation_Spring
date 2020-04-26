package ma.lndroid.tp.spring.aop.aspect.j.xml.aftert.throwing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final String PATH="/ma/lndroid/tp/spring/aop/aspect/j/xml/aftert/throwing/applicationContext.xml";
	
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		Operation e = (Operation) context.getBean("opBean");
		System.out.println("calling Operation validate...");
		
		try {
			System.out.println("12");
			e.validate(12);
		} catch (Exception e2) { System.err.println(e2.getMessage()); }
		
		Thread.sleep(1000);
		
		try {
			System.out.println("20");
			e.validate(20);
		} catch (Exception e2) { System.err.println(e2.getMessage()); }
		
	}
}
