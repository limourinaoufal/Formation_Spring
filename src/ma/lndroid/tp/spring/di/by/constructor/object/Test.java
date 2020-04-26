package ma.lndroid.tp.spring.di.by.constructor.object;

import ma.lndroid.tp.spring.hello.world.Student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	private static final String APPLICATION_CONTEXT_XML_PATH = "/ma/lndroid/tp/spring/di/by/constructor/object/applicationContext.xml";

	public static void main(String[] args) {

		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML_PATH);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Employee emp =  beanFactory.getBean("employeeBean",Employee.class);
			System.out.println(emp);
		

	}

}
