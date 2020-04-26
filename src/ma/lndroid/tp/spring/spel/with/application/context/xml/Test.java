package ma.lndroid.tp.spring.spel.with.application.context.xml;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final String PATH ="ma/lndroid/tp/spring/spel/with/application/context/xml/applicationContext.xml";
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(PATH);
		A a = applicationContext.getBean("a",A.class);
		System.out.println("x:"+a.getX()+" - y:"+a.getY()+"- z:"+a.getZ());
		System.out.println("User Region:"+a.getRegionUser());
		

	}

}
