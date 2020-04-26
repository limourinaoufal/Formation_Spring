package ma.lndroid.tp.spring.di.by.setter.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final String APP_CTX_PATH ="ma/lndroid/tp/spring/di/by/setter/primitive/applicationContext.xml"; 
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APP_CTX_PATH);
		Employee emp = (Employee) applicationContext.getBean("employeeBean");
			System.out.println(emp);
	}
}
